import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N+1];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long tmp = 0L;
        long hunt = 0L;
        for (int i = 0; i < N; i++) {
            long b = sc.nextLong();
            long capa = b + tmp;
            if (a[i] <= capa) {
                if (a[i] <= tmp) {
                    tmp = b;
                } else {
                    tmp = b + tmp - a[i];
                }
                hunt += a[i];
            } else {
                hunt += b + tmp;
                tmp = 0L;
            }
        }
        if (a[N] <= tmp) {
            hunt += a[N];
        } else {
            hunt += tmp;
        }
        System.out.println(hunt);
    }
}