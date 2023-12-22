import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static final BigInteger ONE = BigInteger.ONE;
    public static final BigInteger TWO = ONE.add(ONE);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int [] Ai = new int[M];
        int [] distanceArray = new int[M+1];

        for (int i = 0; i < M; i++) {

            Ai[i] = Integer.parseInt(sc.next());

            if (i == 0) {

                distanceArray[0] = Ai[0]-2 < 0 ? 0 : Ai[0]-2;

            }  else {

                if (Ai[i] == Ai[i]-1) {

                    System.out.println(0);
                    System.exit(0);
                }

                distanceArray[i] = (Ai[i]-1) - (Ai[i-1] + 2);
            }

            if (distanceArray[i] < 0 ) {

                System.out.println(0);
                System.exit(0);
            }
        }

        sc.close();

        distanceArray[M] = (N-1) - (Ai[M-1]+1);

        if (distanceArray[M] < 0 ) {

            System.out.println(0);
            System.exit(0);
        }

        BigInteger ans = ONE;

        for (int i =0; i < M+1; i++) {


            ans = ans.multiply(fanc(N,distanceArray[i]));
        }

        System.out.println(ans.remainder(BigInteger.valueOf(1000000007)));
    }

    public static BigInteger fanc(int N, int num) {

        BigInteger[] dp = new BigInteger[N];

        dp[0] = ONE;
        dp[1] = TWO;

        if ( num > 1) {

            for (int i = 2; i <= num; i++) {

                dp[i] = dp[i-2].add(dp[i-1]);
            }
        }

        return dp[num];
    }
}