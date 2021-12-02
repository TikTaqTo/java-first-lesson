package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        boolean result = a % 2 == 0 ? true : false;

        System.out.println(result);
    }
}
