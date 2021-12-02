package Task12;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double result = pow(x, 4) + 4 * x * pow(y, 2) - (4 * y * z) + pow(z, 4);

        System.out.println(result);
    }
}
