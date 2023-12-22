import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static long solve(int N, int[] A) {
        long ans = 0;
        int l = 0;
        int r = 0;
        int cur = A[0];
        while(l < N) {
            while(r < N-1) {
                int next = A[r+1];
                int xor = cur ^ next;
                int sum = cur + next;

                if( xor == sum ) {
                    r++;
                    cur = sum;
                } else {
                    break;
                }
            }

            ans += r - l + 1;
            cur = cur ^ A[l];
            l++;
        }
        return ans;
    }
}