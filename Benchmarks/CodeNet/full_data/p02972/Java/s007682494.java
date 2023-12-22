import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] or = new int[n];
        int sum = 0;// ボールが入ってる箱の個数
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j > n; j += j) {
                sum += a[j];
            }
            if ((a[i] % 2 - sum % 2) == 1) {
                or[i] = 1;
                count++;
            } else
                or[i] = 0;
            sum = 0;
        }
        if (count != 0) {
            System.out.println(count);
            for (int i = 0; i < n; i++) {
                if (or[i] == 1)
                    System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else {
            System.out.println(0);
        }
    }
}