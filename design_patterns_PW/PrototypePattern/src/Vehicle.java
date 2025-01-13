/**
 * This is an abstract prototype.
 */
public abstract class Vehicle implements Cloneable {

    private String engine;
    private String model;
    private long price;

    public Vehicle(String engine, String model, long price)
    {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    // Getters
    public String getModel(){
        return model;
    }

    public String getEngine(){
        return engine;
    }

    public long getPrice(){
        return price;
    }

    // Setters

    public void setModel(String model){
        this.model = model;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public void setPrice(long price){
        this.price = price;
    }

    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }

}
