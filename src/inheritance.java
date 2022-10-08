// inheritance example

class Vehicle {
    protected final String brand = "Lamborghini";        // Vehicle attribute

    // protected keyword means var is not public but is available for classes which inherits from this class
    protected final String color = "red";
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle { // class Car inherits from class Vehicle
    private final String modelName = "Aventador"; // Car attribute
    public static void main(String[] args) {
        Car myCar = new Car();

        // Call the honk() method (from inherited Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class)
        // and the value of the modelName from the Car class
        // and the value of the color attribute from the Vehicle class
        System.out.printf("%s %s %s", myCar.brand, myCar.modelName, myCar.color);
    }
}
