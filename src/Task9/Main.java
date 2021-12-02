package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble();

        double farenheit = 32 + (celsius * 9 / 5);

        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);
    }
}
