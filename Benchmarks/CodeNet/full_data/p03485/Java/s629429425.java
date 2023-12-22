import java.util.Scanner;

public class Main {
    static int A;
    static int B;

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
        int avg = (int)Math.ceil((double)(A + B) / 2.0);
        System.out.println(avg);
    }
}
