import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        System.out.println( solve(N, S) );
    }

    private static int solve(int N, String S) {
        int[] W = new int[N];
        int[] E = new int[N];

        int ws = 0;
        for (int i = 0; i < N; i++) {
            if( S.charAt(i) == 'W' ) {
                ws++;
            }
            W[i] = ws;
        }

        int es = 0;
        for (int i = N-1; i >= 0 ; i--) {
            if( S.charAt(i) == 'E' ) {
                es++;
            }
            E[i] = es;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int w_e;
            if( i == 0 ) {
                w_e = 0;
            } else {
                w_e = W[i-1];
            }

            int e_w;
            if( i == N -1 ) {
                e_w = 0;
            } else {
                e_w = E[i+1];
            }

            min = Math.min(min, w_e + e_w);
        }
        return min;
    }
}