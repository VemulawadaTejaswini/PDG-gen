import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        if (x == 1 || x == N) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
        for (int i = 1; i < N - 1; ++i) {
            if (i + 1 != x) {
                System.out.println(i + 1);
            }
        }
        System.out.println(x);
        for (int i = N; i < 2 * N; ++i) {
            if (i + 1 != x) {
                System.out.println(i + 1);
            }
        }
    }
}