import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] times = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
            sum += times[i];
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(sum - times[p - 1] + x);
        }
    }
}