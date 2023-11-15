package se.distansakademin.vehicles;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    public String getMotorcycleInfo(){
        var sideCarInfo = hasSidecar ? " and has sidecar" : " and has no sidecar";
        return getFeatures() + sideCarInfo;
    }

    @Override
    public void accelerate() {
        speed += 15;
    }
}
