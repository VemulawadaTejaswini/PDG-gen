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
        for (int i = 1; i < N; ++i) {
            if (i != x) {
                System.out.println(i);
            }
        }
        System.out.println(x);
        for (int i = N; i < 2 * N; ++i) {
            if (i != x) {
                System.out.println(i);
            }
        }
    }
}