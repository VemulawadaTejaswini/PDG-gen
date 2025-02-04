
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long[] b = new long[n - 1];
        for (int i = 0 ; i < n - 1 ; i++) {
            b[i] = (long) a[i] + a[i + 1];
        }

        long answer = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            //a[i + 1]を優先的に減らす。それでもだめであれば、a[i]を減らす。
            if (x < b[i]) {
                if (a[i + 1] >= x) {
                    answer += (long) b[i] - x;
                    a[i + 1] = 0;
                    if (i < n - 2) {
                        b[i + 1] -= (long) (b[i] - x);
                    }

                } else {
                    answer += (long) b[i] - x;
                    a[i + 1] -= (long) (b[i] - x);
                    if (i < n - 2) {
                        b[i + 1] -= (long) (b[i] - x);
                    }

                }
            }
        }
        System.out.println(answer);
    }

}