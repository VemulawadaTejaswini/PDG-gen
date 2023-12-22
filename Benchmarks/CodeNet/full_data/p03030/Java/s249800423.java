import java.util.*;

public class Main {
    static int N;
    static int K;
    static int Q;
    static int[] V;
    // static int[] k;
    // static Condition[] st;
    // static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R[] arr = new R[N];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int p = Integer.parseInt(sc.next());
            arr[i] = new R(i+1, s, p);
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].i);
        }
    }
    static class R implements Comparable<R> {
        int i;
        int p;
        String s;
        public R (int i, String s, int p) {
            this.i = i;
            this.s = s;
            this.p = p;
        }
        @Override
        public int compareTo(R o) {
            if (this.s.equals(o.s)) {
                return o.p - this.p;
            } else {
                return this.s.compareTo(o.s);
            }
        }
    }
}