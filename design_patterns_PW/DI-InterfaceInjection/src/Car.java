public class Car implements EngineInjector {
    private Engine engine; // Declaring Dependency

    // Implement the injectEngine method to set the engine
    // Dependency
    @Override
    public void injectEngine(Engine engine){
        this.engine = engine; // Dependency injected through the interface
        // method
    }

    public void drive(){
        engine.start(); // Using the injected engine dependency
        System.out.println("Car is driving");
    }
}
