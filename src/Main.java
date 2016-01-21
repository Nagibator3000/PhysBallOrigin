import java.util.Scanner;

public class Main {
    public static double tsqr;
    public static double x;
    public static double g = 9.8;
    public static double t;
    public static double[] cord;
    public static double u;

    public static void main(String[] args) {
        System.out.println("Enter height m");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        tsqr = 2 * x/ g;
        t = Math.sqrt(tsqr);


        for (int i = 0; i < t; i++) {
            cordInSec(i);
            System.out.println(x);

        }

    }

    public static double cordInSec(int i) {
        x=g*(i*i)/2;
        return x;
    }

}

