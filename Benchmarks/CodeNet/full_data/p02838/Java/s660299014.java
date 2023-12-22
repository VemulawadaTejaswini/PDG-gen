import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        long R = 0;

        for (int D = 0; D < 60; D++) {
            int zNum = 0, oNum = 0;
            long B = 1L << D;
            for (int i = 0; i < N; i++) {
                if ( ( A[i] & B ) == B ){
                    oNum++;
                } else {
                    zNum++;
                }
            }

            R = (R + B * (oNum * zNum % MOD) % MOD) % MOD;

        }

        System.out.println(R);
    }


    long modPow(long n){
        long R = 1L;

        long A = 2;
        while(n > 0){
            if( (n & 1) == 1)
                R = (R * A) % MOD;
            A = (A * A) % MOD;
            n = n >> 1;
        }

        return R;
    }

    public static void main(String[] args) {
        new Main();
    }
}
