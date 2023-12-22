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
        long rt = T[0];
        long ra = A[0];

        for (int i = 1; i < N; i++) {
            long t = T[i];
            long a = A[i];

            if( t < rt ) {
                long d = rt / t;
                long r = rt % t;

                if( r == 0 ) {
                    t = d * t;
                    a = d * a;
                } else {
                    t = (d+1) * t;
                    a = (d+1) * a;
                }
            }

            if( a < ra ) {
                long d = ra / a;
                long r = ra % a;

                if( r == 0 ) {
                    t = d * t;
                    a = d * a;
                } else {
                    t = (d+1) * t;
                    a = (d+1) * a;
                }
            }

            rt = t;
            ra = a;
        }
        return rt + ra;
    }
}