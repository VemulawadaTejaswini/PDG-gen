import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            if (a * i % c == c) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}