import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b < a) {
            System.out.println("delicious");
            return;
        }

        if (x >= b - a) {
            System.out.println("safe");
            return;
        }

        System.out.println("dangerous");
    }
}