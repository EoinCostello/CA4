package gradle;

public class Geometry {

    public static float areaRect(double d, double e) {
        // areaRect() method
        return (float) (d*e);
    }

    public static double perimeterRect(double d, double e) {
        // perimeterRect() method
        return 2*(d + e);
    }

    public static float volumeSphere(double d) {
        // volumeSphere() method
        return (float) ((4f/3f)*Math.PI*d*d*d);
    }

    public static float surfaceAreaSphere(double r) {
        // surfaceAreaSphere() method
        return (float) (4*Math.PI*r*r);
    }
}
