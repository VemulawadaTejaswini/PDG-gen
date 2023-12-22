import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long ans = 0;
        for (int i = 2; i <= M; i++) {
            if (M % i == 0 && N * i <= M) {
                ans = i;
            }
            if(N * i > M){
                break;
            }
        }
        System.out.println(ans);
    }
}