public class Car {
    private Engine engine; // Declaring a dependency on Engine

    // No constructor injection is used here, we are
    // Using setter to inject dependency
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}
