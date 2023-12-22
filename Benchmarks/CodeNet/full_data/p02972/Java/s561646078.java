import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] or = new int[n];
        int sum = 0;// ボールが入ってる箱の個数
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if ((a[i] - sum % 2) == 1) {
                or[i] = 1;
                sum++;
            } else
                or[i] = 0;
        }
        if (sum != 0) {
            System.out.println(sum);
            for (int i = 0; i < n; i++) {
                if (or[i] == 1)
                    System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println(0);
        }
    }
}