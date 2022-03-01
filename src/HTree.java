public class HTree {
    public static void draw(int n, double length, double x, double y) {
        if (n == 0)
            return;

        StdDraw.line(x-length/2, y, x+length/2, y);
        StdDraw.line(x+length/2, y-length/2, x+length/2, y+length/2);
        StdDraw.line(x-length/2, y-length/2, x-length/2, y+length/2);
        draw(n-1, length/2, x-length/2, y+length/2);
        draw(n-1, length/2, x+length/2, y+length/2);
        draw(n-1, length/2, x-length/2, y-length/2);
        draw(n-1, length/2, x+length/2, y-length/2);
    }

    public static void drawHs(int total) {
        draw(total, 0.5, 0.5, 0.5);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        drawHs(n);
    }
}
