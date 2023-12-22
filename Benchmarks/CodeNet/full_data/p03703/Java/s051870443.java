import java.util.*;

public class Main {
    static long[] bit;
    static int len;

    static void add(int x, long y) {
        while (x<=len) {
            bit[x] += y;
            x += x&(-x);
        }
    }

    static long sum(int x) {
        long tmp = 0L;
        while (x>0) {
            tmp += bit[x];
            x -= x&(-x);
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
            a[i] -= K;
        }
        long[] ruiseki = new long[N+1];
        TreeSet<Long> set = new TreeSet<Long>();
        set.add(0L);
        for (int i=0;i<N;i++) {
            ruiseki[i+1] = ruiseki[i]+a[i];
            set.add(ruiseki[i+1]);
        }
        ArrayList<Long> list = new ArrayList<Long>(set);
        int[] ruiseki_new = new int[N+1];
        for (int i=0;i<N+1;i++) {
            ruiseki_new[i] = Collections.binarySearch(list, ruiseki[i])+1;
        }

        len = list.size();
        bit = new long[len+1];
        for (int i=0;i<N+1;i++) {
            add(ruiseki_new[i], 1);
        }
        long ans = 0L;
        for (int i=0;i<N+1;i++) {
            add(ruiseki_new[i], -1);
            ans += (N-i-sum(ruiseki_new[i]-1));
        }
        System.out.println(ans);
    }
}