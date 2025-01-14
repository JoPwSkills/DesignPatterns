public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(); // Create Engine object (Dependency)

        // Injecting Engine dependency when creating car

        Car car = new Car(engine); // Pass the Engine Instance to the constructor

        car.drive();

    }
}