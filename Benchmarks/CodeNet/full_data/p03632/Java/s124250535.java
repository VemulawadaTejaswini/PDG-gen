import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (d <= a || b <= c) {
            System.out.println(0);
            return;
        }

        if (c <= a) {
            if (d <= b) {
                System.out.println(d - a);
            } else {
                System.out.println(b - a);
            }
        } else if (c < b) {
            if (d <= b) {
                System.out.println(d - c);
            } else {
                System.out.println(b - c);
            }
        }
    }
}