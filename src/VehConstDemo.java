/**
 * Created with IntelliJ IDEA.
 * User: che
 * Date: 10.02.14
 * Time: 8:12
 * To change this template use File | Settings | File Templates.
 */
public class VehConstDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
    }
}
