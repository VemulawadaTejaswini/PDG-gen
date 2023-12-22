import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();

        }
        boolean aturn = true;
        for (int i = 0; i < n; i++) {
            int max = 0;
            int pos = 0;
            int maxA = 0;
            int maxB = 0;

            for (int j = 0; j < n; j++) {
                if (max < a[j]) {
                    max = a[j];
                    pos = j;
                }
                if (max < b[j]) {
                    max = b[j];
                    pos = j;
                }
                if (max == a[j]) {
                    if (maxB < b[j]) {
                        maxB = b[j];
                        pos = j;
                    }
                }
                if (max == b[j]) {
                    if (maxA < a[j]) {
                        maxA = a[j];
                        pos = j;
                    }
                }
            }
            if (aturn) {
                ans += a[pos];
                aturn = false;
            } else {
                ans -= b[pos];
                aturn = true;
            }
            a[pos] = 0;
            b[pos] = 0;
        }
        System.out.println(ans);
    }
}
