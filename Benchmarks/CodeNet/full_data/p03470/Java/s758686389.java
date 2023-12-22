import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextInt();
        }

        Arrays.sort(ds);
        int ans = 0;
        int tmp = 0;
        for (int d : ds) {
            if (d != tmp) {
                ans++;
                tmp = d;
            }
        }
        System.out.println(ans);
    }
}