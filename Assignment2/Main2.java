interface Vehicle 
{
    String getVehicleName();
}

class Bike implements Vehicle 
{
    public String getVehicleName() 
    {
        return "Bike";
    }
}

class Car implements Vehicle 
{
    public String getVehicleName() 
    {
        return "Car";
    }
}

class traveller 
{
    public void travellerVehicleName(Vehicle vehicle) 
    {
        System.out.println("The traveller is using a: " + vehicle.getVehicleName());
    }
}

public class Main2 
{
    public static void main(String[] args) 
    {
        traveller traveller = new traveller();

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        traveller.travellerVehicleName(bike);  // Output: The traveller is using a: Bike
        traveller.travellerVehicleName(car);   // Output: The traveller is using a: Car
    }
}