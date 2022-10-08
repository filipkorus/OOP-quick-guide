interface Animal {
	public void eat(); // in the interface we specify what methods class must to implements, for example:
	public void makeNoise(); // every animal can make noise but all of them do it in different ways
									// so this method cannot be the same for every animal
									// and that is why we only tell that this method must be implemented for every animal

}

// IMPORTANT: 'implements' keyword
class Dog implements Animal {
	// then we implement every method specified in the interface above
	public void eat() {
		System.out.println("I am eating my dog food..."); // dog is eating dog food
	}

	public void makeNoise() {
		System.out.println("woof woof"); // dog is barking
	}
}

class Cat implements Animal {
	// then we implement every method specified in the interface
	public void eat() {
		System.out.println("What a great milk!"); // cat is drinking milk
	}

	public void makeNoise() {
		System.out.println("meow meow"); // cat is meowing
	}
}
