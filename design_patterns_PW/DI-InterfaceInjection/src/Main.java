public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(); // Create engine object

        Car car = new Car();

        car.injectEngine(engine); // Inject Dependency via the injectEngine()

        car.drive();
    }
}