package Task26;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int V = a * b * c;

        int S = 2 * (a * b + b * c + a * c);

        System.out.println(V);
        System.out.println(S);
    }
}
