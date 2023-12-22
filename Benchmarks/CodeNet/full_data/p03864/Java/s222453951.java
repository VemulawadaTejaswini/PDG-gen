import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        long a0 = sc.nextLong();
        long count = 0;
        for (int i = 1; i < n; i++) {
            long a1 = sc.nextLong();
            while (a0 + a1 > x) {
                if (a1 > 0) {
                    a1--;
                } else {
                    a0--;
                }
                count++;
            }
            a0 = a1;
        }
        System.out.println(count);
    }
}
