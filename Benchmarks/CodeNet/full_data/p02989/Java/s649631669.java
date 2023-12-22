import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;
    int MAX_M = 100000;
    int MAX_N = 100000;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0;i < N;i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        System.out.println(d[N/2]-d[N/2-1]);
    }
}