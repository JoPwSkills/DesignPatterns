public class TwoWheelerVehicle extends Vehicle {
    private boolean isElectric;

    public TwoWheelerVehicle(String engine, String model,
                             long price, boolean isElectric){
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    // In order to make any class cloneable we need to
    // implement the clone method, even if that class
    // is not implementing cloneable interface directly

    protected TwoWheelerVehicle clone() throws CloneNotSupportedException{
        System.out.println("Two Wheeler Vehicle is cloned Successfully");
        return (TwoWheelerVehicle) super.clone();
    }
}
