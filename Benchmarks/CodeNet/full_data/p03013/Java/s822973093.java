import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int [] Ai = new int[M];
        int [] distanceArray = new int[M+1];

        for (int i = 0; i < M; i++) {

            Ai[i] = Integer.parseInt(sc.next());

            if (i == 0) {

                distanceArray[0] = Ai[0]-1;
            }  else {

                if (Ai[i] == Ai[i]-1) {

                    System.out.println(0);
                    System.exit(0);
                }

                distanceArray[i] = (Ai[i]-1) - (Ai[i-1] + 1);
            }

            if (distanceArray[i] < 0 ) {

                System.out.println(0);
                System.exit(0);
            }
        }

        sc.close();

        distanceArray[M] = N - (Ai[M-1]+1);

        if (distanceArray[M] < 0 ) {

            System.out.println(0);
            System.exit(0);
        }

        BigInteger ans = BigInteger.ONE;

        for (int i =0; i < M+1; i++) {

            IntStream.range(1, distanceArray[i])
            .forEach(n -> fanc(BigInteger.valueOf(n)));

            ans = ans.multiply(fanc(BigInteger.valueOf(distanceArray[i])));
        }

        System.out.println(ans.remainder(BigInteger.valueOf(1000000007)));
    }

    public static BigInteger fanc(BigInteger num) {

        return MEMO_MAP.computeIfAbsent(num, key -> fanc(num.subtract(BigInteger.ONE)).add(fanc(num.subtract(BigInteger.ONE.add(BigInteger.ONE)))));
    }

    private static final Map<BigInteger, BigInteger> MEMO_MAP = new HashMap<>();
    static {

        MEMO_MAP.put(BigInteger.ONE, BigInteger.ONE);
        MEMO_MAP.put(BigInteger.ONE.add(BigInteger.ONE), BigInteger.ONE.add(BigInteger.ONE));
    }

}