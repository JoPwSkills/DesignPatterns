public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(); // Create Engine Object

        // Create car object without providing engine immediately
        Car car = new Car();

        // Inject the engine dependency using the setter method

        car.setEngine(engine);
        car.drive();

    }
}