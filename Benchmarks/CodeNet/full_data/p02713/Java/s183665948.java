import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        long sum = 0;
        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                long tmp = getDualGcb(a, b);
                for (int c = 1; c <= K; c++) {
                    long tmp2 = getDualGcb(tmp, c);
                    sum += tmp2;
                }
            }
        }
        System.out.println(sum);
    }

    public static long getDualGcb(long m, long n) {
        long ret = 0;
        for (long i = m; i >= 1; i--) {
            if (m % i != 0) {
                continue;
            }
            if (n >= i && n % i == 0) {
                ret = i;
                break;
            }
        }
        return ret;
    }
}
