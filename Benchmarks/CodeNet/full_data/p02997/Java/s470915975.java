import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = maxCount(n);

        if (max < k) {
            System.out.println(-1);
            return;
        }
        int count = n - 1 + max - k;
        System.out.println(count);
        for (int i = 2; i <= n; i++) {
            System.out.println("1 " + i);
        }
        for (int i = 2; i < (max - k + 2); i++) {
            int i_1 = (i + 1) % n;
            int end = ((i + 1) % n == 0) ? 2 : i_1;
            System.out.println(i + " " + end);
        }
    }

    public static int maxCount(int n) {
        return (n - 1) * (n - 2) / 2;
    }
}