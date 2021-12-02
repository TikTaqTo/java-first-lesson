package Task25;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int y = 4*(x-3)-7*(x-3)+2;

        System.out.println(y);
    }
}
