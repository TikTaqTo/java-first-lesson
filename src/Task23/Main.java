package Task23;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double L = in.nextDouble();
        double R = L / (2 * 3.14);
        double S = 3.14 * R * R;

        System.out.println(R);
        System.out.println(S);
    }
}
