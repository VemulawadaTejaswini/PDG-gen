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
        for (int i = 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(i + " " + j);
                count2--;
                if (count2 == 0) {
                    return;
                }
            }
        }
    }

    public static int maxCount(int n) {
        return (n - 1) * (n - 2) / 2;
    }
}