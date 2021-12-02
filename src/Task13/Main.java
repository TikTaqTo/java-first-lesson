package Task13;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double result = pow(x, 3) + 5 * x * y - 6 * z * y + pow(z, 3);

        System.out.println(result);
    }
}
