import java.util.Scanner;

public class Main {
    public static double tsqr;
    public static int x;
    public static double g = 9.8;
    public static double t;
    public static double[] speeds;
    public static double u;

    public static void main(String[] args) {
        System.out.println("Enter height m");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        speeds = new double[x];
        for (int i = 0; i < x; i++) {
            timeAndSpeed(i);
            speeds[i]=u;
            System.out.println(x-i+" Height m  Speed: "+speeds[i]);
        }

    }

    public static double timeAndSpeed(int i) {
        tsqr = 2 * i / g;
        t = Math.sqrt(tsqr);
        u = g * t;
        return u;
    }

}

