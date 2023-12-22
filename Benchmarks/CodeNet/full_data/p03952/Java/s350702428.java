import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
        if (N == 2) {
            for (int i = 1, n = 2 * N; i < n; ++i) {
                System.out.println(i);
            }
        } else {
            for (int i = 1, n = N - 1; i < n; ++i) {
                if (i != x && i != x - 1 && i != x + 1) {
                    System.out.println(i);
                }
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = N, n = 2 * N; i < n; ++i) {
                if (i != x && i != x - 1 && i != x + 1) {
                    System.out.println(i);
                }
            }
        }
    }
}