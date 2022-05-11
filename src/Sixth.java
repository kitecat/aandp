import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        System.out.print(length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x3, y3, x1, y1));
    }

    public static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
