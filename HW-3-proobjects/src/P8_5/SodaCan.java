package P8_5;

/**
 * Created by Eason on 10/12/15.
 */
public class SodaCan {
    private double height;
    private double radius;

    public SodaCan(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 2 * radius * radius * Math.PI + 2 * radius * Math.PI * height;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    public void print() {
        System.out.printf("The surface area of soda can with radius: %.2f and height: %.2f is %.2f\n", radius, height, getSurfaceArea());
        System.out.printf("The volume of soda can with radius: %.2f and height: %.2f is %.2f\n", radius, height, getVolume());
    }

}
