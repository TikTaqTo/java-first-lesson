package Task24;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        double y = (3 * pow(x, 2)) - (6*x) - 7;

        System.out.println(y);
    }
}
