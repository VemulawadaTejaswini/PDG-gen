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
        int k = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            int tmp = 1;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    tmp *= 2;
                } else {
                    tmp += k;
                }
            }

            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}