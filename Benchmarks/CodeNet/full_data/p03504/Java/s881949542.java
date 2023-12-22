import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static int n, c;
    static int[] S, T, C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        c = in.nextInt();
        S = new int[n];
        T = new int[n];
        C = new int[n];
        for(int i = 0; i < n; i++) {
            S[i] = in.nextInt();
            T[i] = in.nextInt();
            C[i] = in.nextInt();
        }

        int[] memo = new int[200005];
        Arrays.fill(memo, 0);
        for(int i = 0; i < n; i++) {
            int si = S[i];
            int ti = T[i];
            memo[2*si-1]++;
            memo[2*ti+1]--;
        }

        //for(int i = 0; i < 30; i++) {
        //    System.out.print(memo[i]);
        //}

        int[] counts = new int[200005];
        Arrays.fill(counts, 0);
        counts[0] = memo[0];
        for(int i = 1; i < 200005; i++) {
            counts[i] = counts[i-1] + memo[i];
        }

        int ans = Arrays.stream(counts).max().getAsInt();
        print(ans);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }
}