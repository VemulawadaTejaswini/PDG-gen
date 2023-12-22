package app;

import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int X = scanner.nextInt();
        final int Y = scanner.nextInt();
        final int Z = scanner.nextInt();
        System.out.println(Z + " " + X + " " + Y);
        scanner.close();
    }
}