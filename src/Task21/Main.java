package Task21;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int R = in.nextInt();
        double P = 3.14;
        double L = 2 * P * R;

        System.out.println(L);

        double S = P * pow(R, 2);

        System.out.println(S);
    }
}
