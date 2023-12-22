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

        int count2 = max - k;
        for (int i = 0; i < count2; i++) {
            int st = 2 + (i / n);
            int gl = 2 + (i % n) + (i / n);
            System.out.println(st + " " + gl);
        }
    }

    public static int maxCount(int n) {
        return (n - 1) * (n - 2) / 2;
    }
}