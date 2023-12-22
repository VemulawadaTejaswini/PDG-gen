import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int[] xs = new int[N];
        BigInteger[] counts = new BigInteger[A];
        for(int i = 0; i < A; i++) {
            counts[i] = BigInteger.ZERO;
        }

        for(int i = 0; i < N;i++) {
            xs[i] = scanner.nextInt();
        }


        for(int x: xs) {

            BigInteger[] newCounts = new BigInteger[A];
            for(int i = 0; i < A; i++) {
                newCounts[i] = BigInteger.ZERO.add(counts[i]);
            }


            int y = x % A;

            for (int i = 0; i < A; i++) {
                counts[(i + y) % A] = counts[(i + y) % A].add(newCounts[i]);
            }

            counts[y] = counts[y].add(BigInteger.ONE);

        }

        System.out.println(counts[0].toString());
    }
}