import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);
    }

    private static void finish() {
    }


    public static void main(String[] args) {
        start();

        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a * b % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        finish();
    }
}
