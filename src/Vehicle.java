/**
 * Created with IntelliJ IDEA.
 * User: che
 * Date: 10.02.14
 * Time: 8:05
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {
    int passengers;
    int fuelcup;
    int mpg;

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcup = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcup;
    }

    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}
