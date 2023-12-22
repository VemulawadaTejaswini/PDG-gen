import java.util.Scanner;
import java.util.Arrays;

public class Main {

    class Pair {

        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 2];
        int[] B = new int[N + 2];
        int ans = 0;
        A[0] = 0;
        ans = A[0];
        A[N + 1] = 0;
        for (int i = 1; i < N + 1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i <= N + 1; i++) {
            B[i] = Math.abs(A[i] - A[i - 1]);
            ans += B[i];
        }
        for(int i=1;i<N+1;i++){
            System.out.println(ans-B[i]-B[i+1]+Math.abs(A[i+1]-A[i-1]));
        }
    }

}