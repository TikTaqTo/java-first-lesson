package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int all = in.nextInt();

        int a = all % 10;

        all = all / 10;

        int b = all % 10;

        all = all / 10;

        int c = all % 10;

        System.out.println(a + b + c);
    }
}
