public class Tree {

    public static double initialThickness = 0.03;
    public static double lengthReductionFactor = 1.0/2;
    public static double middleTwigReductionFactor = 1.0/2;
    public static double thicknessReductionFactor = 1.0/1.5;
    public static double crookAngle = 10.0;
    public static double halfOpenAngle = 40.0;


    public static void draw(int n) {
        // draw trunk
        double x0 = 0.5;
        double y0 = 0.0;
        double length = 0.5;
        StdDraw.setPenRadius(initialThickness);
        StdDraw.line(x0, y0, x0, y0+length);

        draw(n, x0, y0+length, 90, .25,
                initialThickness*thicknessReductionFactor);


    }
    public static void draw(int n, double x0, double y0, double theta0, double length, double thickness) {
        if (n == 0)
            return;

        double x1, y1, theta1;
        // branch 1
        theta1 = theta0 + crookAngle + halfOpenAngle;
        x1 = x0 + length * Math.cos(Math.toRadians(theta1));
        y1 = y0 + length * Math.sin(Math.toRadians(theta1));
        StdDraw.setPenRadius(thickness);
        StdDraw.line(x0, y0, x1, y1);
        draw(n - 1, x1, y1, theta1,
                length * lengthReductionFactor,
                thickness * thicknessReductionFactor);

        // branch 2
        theta1 = theta0 + crookAngle;
        x1 = x0 + length * middleTwigReductionFactor * Math.cos(Math.toRadians(theta1));
        y1 = y0 + length * middleTwigReductionFactor * Math.sin(Math.toRadians(theta1));
        StdDraw.setPenRadius(thickness);
        StdDraw.line(x0, y0, x1, y1);
        draw(n - 1, x1, y1, theta1,
                length * lengthReductionFactor * middleTwigReductionFactor,
                thickness * thicknessReductionFactor);


        //branch 3
        theta1 = theta0 + crookAngle - halfOpenAngle;
        x1 = x0 + length * Math.cos(Math.toRadians(theta1));
        y1 = y0 + length * Math.sin(Math.toRadians(theta1));
        StdDraw.setPenRadius(thickness);
        StdDraw.line(x0, y0, x1, y1);
        draw(n - 1, x1, y1, theta1,
                length * lengthReductionFactor,
                thickness * thicknessReductionFactor);

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n);
    }
}
