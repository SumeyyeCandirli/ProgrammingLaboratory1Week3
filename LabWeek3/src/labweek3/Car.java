package labweek3;

public class Car {
    
    protected String plateNumber;
    protected String model;
    protected double mileage = 0;
    protected double fuelLevel;
    protected double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double fuelNeeded = km / 10;

        if (fuelNeeded > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= fuelNeeded;
            System.out.println("Driving " + km + " km...");
        }
    }

    public void refuel(double amount) {
        System.out.println("Refueling " + amount + " liters...");
        fuelLevel += amount;

        if (fuelLevel > tankCapacity) {
            System.out.println("Tank is full, extra fuel discarded.");
            fuelLevel = tankCapacity;
        }
    }

    public void checkStatus() {
        System.out.println("Current Mileage: " + mileage + " km");
        System.out.println("Current Fuel Level: " + fuelLevel + " / " + tankCapacity + " Liters");

        if (fuelLevel < tankCapacity * 0.1) {
            System.out.println("Low fuel warning!");
        }
    }
    
}
