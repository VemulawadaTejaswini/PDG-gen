import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] aryA = new long[N+1];
        long[] aryB = new long[N];
        for (int i = 0; i < N+1; i++) {
            long a = Long.parseLong(sc.next());
            aryA[i] = a;
        }
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(sc.next());
            aryB[i] = a;
        }
        long cnt = 0L;
        for (int i = 0; i < N; i++) {
            long enemyCnt = 0L;
            enemyCnt = (aryA[i] + aryA[i+1]) - aryB[i];
            if (enemyCnt < 0) {
                cnt += aryA[i] + aryA[i+1];
            } else {
                cnt += aryB[i];
            }
            if (aryA[i] < aryB[i]) {
                long sabun = Math.abs(aryA[i] - aryB[i]);
                long after = aryA[i+1] - sabun;
                if (after < 0) {
                    aryA[i + 1] = 0;
                } else {
                    aryA[i + 1] = after;
                }
            }
        }
        System.out.println(cnt);
    }
}