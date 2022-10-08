abstract class Animal_ {
	int age; // every animal has its own name,
	// but you are supposed to initialize it inside a class that 'extends' it
	String name;

	public void printName() {
		System.out.printf("My name is %s\n", name);
	}

	// we expect that getNoise() method will be implemented
	// in the class that 'extends' this one
	public abstract void getNoise();
}

// IMPORTANT: 'extends' keyword
class Spider extends Animal_ {
	Spider(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override // override getNoise() method from Animal_ abstract class
	public void getNoise() {
		System.out.println("Spiders are silent!");
	}
}

class Main {
	public static void main(String[] args) {
		// Animal_ animal = new Animal_(); // cannot make a new instance of Animal_ abstract class

		Spider spider = new Spider(2, "Webster");
		spider.printName();
		spider.getNoise();
	}
}
