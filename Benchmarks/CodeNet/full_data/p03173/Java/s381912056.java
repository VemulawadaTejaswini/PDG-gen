import java.util.*;

public class Main {

    static int N;
    static int[] a;
    static long INF = Long.MAX_VALUE;
    static long[] ruiseki;

    static long dp(int left, int right) {
        if (left==right) return 0;

        long min = INF;
        for (int i=left;i<right;i++) {
            min = Math.min(min, dp(left, i)+dp(i+1, right)+ruiseki[right+1]-ruiseki[left]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        a = new int[N];
        ruiseki = new long[N+1];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            ruiseki[i+1]=ruiseki[i]+a[i];
        }
        System.out.println(dp(0, N-1));
    }
}