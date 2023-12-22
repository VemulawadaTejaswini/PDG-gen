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
        for (int i = N - 1; i >= 0; i--) {
            if ((aryA[i] + aryA[i + 1]) - aryB[i] >= 0) {
                cnt += aryB[i];
            } else {
                cnt += aryA[i] + aryA[i + 1];
            }
        }
        System.out.println(cnt);
    }
}