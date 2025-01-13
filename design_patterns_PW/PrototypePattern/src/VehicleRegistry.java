import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> mapVehicles = new HashMap<>();

    static {
        mapVehicles.put("TWO", new TwoWheelerVehicle("1200",
                "RE", 100000, false));
        mapVehicles.put("FOUR", new FourWheelerVehicle("1200", "BMW", 1000000, false, false));
    }

    public Vehicle getVehicle(String vehicle)throws CloneNotSupportedException{
        return mapVehicles.get(vehicle).clone();
    }
}



