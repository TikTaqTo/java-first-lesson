package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        a = a * 2;
        b = b - 3;
        c = c * c;

        System.out.println(a + b + c);
    }
}
