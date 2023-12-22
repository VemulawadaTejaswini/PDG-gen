import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Main {
    static int A;
    static int B;
    static int[] a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        init();
        // logic
        logic();
    }

    static void logic() {
        int distance = Math.max(A - B * 2, 0);
        System.out.println(distance);
    }
}