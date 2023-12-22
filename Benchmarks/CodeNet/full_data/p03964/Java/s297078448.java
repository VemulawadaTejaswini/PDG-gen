import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }

        System.out.println( solve(N, T, A) );
    }

    private static long solve(int N, int[] T, int[] A) {
        long t_result = T[0];
        long a_result = A[0];

        for (int i = 1; i < N; i++) {
            long t = T[i];
            long a = A[i];

            // 昔の票数以上になる比の数まで大きくする
            long td = bairitsu(t, t_result);
            long ad = bairitsu(a, a_result);
            long d = Math.max(td, ad);

            t_result = d * t;
            a_result = d * a;
        }
        return t_result + a_result;
    }

    // i を何倍したら n 以上になるか
    private static long bairitsu(long i, long n) {
        long d = n / i;
        long r = n % i;

        if( r == 0 ) {
            return d;
        } else {
            return d + 1;
        }
    }
}