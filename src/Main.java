import java.util.Scanner;

public class Main {
    public static double tsqr;
    public static double x;
    public static int longX;
    public static double g = 9.8;
    public static double t;
    public static int[] cord;
    public static int[][] place;
    public static double u;
    public static int[] cord1;

    public static void main(String[] args) {
        System.out.println("Enter height m");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        longX = (int) x;
        timeCalc();
        cord1 = new int[longX];
        cord = new int[longX];
        System.out.println("all time fall: " + t);
        for (int i = 0; i < t; i++) {
            cordInSec(i);
            int xCel = (int) x;
            cord[i] = xCel;

            System.out.println(cord[i]);
        }

        print();
    }

    public static void timeCalc() {
        tsqr = 2 * x / g;
        t = Math.sqrt(tsqr);
    }

    public static double cordInSec(int i) {
        x = g * (i * i) / 2;
        return x;
    }

    public static void print() {
       for (int j = 0; j < cord1.length; j++){
             { for (int i = 0; i < t; i++)
                 if (cord[i] == j) {
                    cord1[j] = cord[i];
                    System.out.print(" *");

                }else {
                    System.out.print(" _");
                }

            }

            System.out.println();
        }
    }

}

