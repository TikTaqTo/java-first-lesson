package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int resultA = a + b;
        int resultB = c - a;
        int resultC = a + b + c;

        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
    }
}
