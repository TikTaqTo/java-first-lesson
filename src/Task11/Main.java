package Task11;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double result = pow(a, 3) + 2 * pow(b, 2) - 3 * a * b + pow(c, 3);

        System.out.println(result);
    }
}
