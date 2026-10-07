package labweek3;

public class LabWeek3 {

    public static void main(String[] args) {
       
        Car car1 = new Car("38 AB 123", "Toyota Corolla", 40.0, 50.0);

        System.out.println("Model: " + car1.model);
        System.out.println("Plate: " + car1.plateNumber);
        car1.checkStatus();
        System.out.println("----------------------------------------");

        // Normal trip: Drive 360 km (consumes 36L, leaves 4L which is below 10%)
        car1.drive(360);
        car1.checkStatus();
        System.out.println("----------------------------------------");

        // Edge case 1: Insufficient fuel to complete the trip (needs 5L, only 4L left)
        car1.drive(50);
        System.out.println("----------------------------------------");

        // Edge case 2: Refuel exceeding tank capacity (adds 60L to 4L in a 50L tank)
        car1.refuel(60);
        car1.checkStatus();

    }
    
}
