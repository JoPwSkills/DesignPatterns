public class Car {
    private Engine engine; // Declaring a dependency on Engine

    // Constructor Injection: Dependency is provided through the constructor
    public Car(Engine engine){
        this.engine = engine; // Engine dependency is injected via constructor
    }

    public void drive(){
        engine.start(); // Using the injected engine dependency
        System.out.println("Car is driving");
    }
}
