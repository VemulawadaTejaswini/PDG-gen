import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n =sc.nextInt();
        int k = sc.nextInt();

        if (n == k) {
            System.out.println(1);
            return;
        }
        System.out.println(n % (k - 1) == 0 ? n / (k - 1) : n / (k - 1) + 1);
    }
}
