
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, P, A));
    }

    private static long solve(int N, int P, int[] A) {
        long sum = 0;

        int numEven = 0;
        int numOdd = 0;

        for (int i=0; i<N; i++) {
            if (A[i]%2 == 0) {
                numEven++;
            } else {
                numOdd++;
            }
        }

        if (P == 0) {

            if (numOdd >= 2) {
                BigInteger subtotal;
                for (int i = 0; i <= numOdd; i += 2) {
                    subtotal = BigInteger.ONE;

                    for (int k=0; k<i; k++) {
                        subtotal = subtotal.multiply(BigInteger.valueOf(numOdd-k));
//                        System.out.println("debug(multiply): k=" + k + ", subtotal=" + subtotal + ", value=" + (numOdd-k));
                    }
                    for (int k=i; k>0; k--) {
                        subtotal = subtotal.divide(BigInteger.valueOf(k));
//                        System.out.println("debug(divide): k=" + k + ", subtotal=" + subtotal + ", value=" + k);
                    }
  //                  System.out.println("debug: i=" + i + ", subtotal=" + subtotal);
                    sum += subtotal.longValue();
                }
            }
        } else {
            if (numOdd == 0) {
                return 0;
            } else {
                BigInteger subtotal;
                for (int i = 1; i <= numOdd; i += 2) {
                    subtotal = BigInteger.ONE;

                    for (int k=0; k<i; k++) {
                        subtotal = subtotal.multiply(BigInteger.valueOf(numOdd-k));
//                        System.out.println("debug(multiply): k=" + k + ", subtotal=" + subtotal + ", value=" + (numOdd-k));
                    }
                    for (int k=i; k>0; k--) {
                        subtotal = subtotal.divide(BigInteger.valueOf(k));
//                        System.out.println("debug(divide): k=" + k + ", subtotal=" + subtotal + ", value=" + k);
                    }

//                    System.out.println("debug: i=" + i + ", subtotal=" + subtotal);
                    sum += subtotal.longValue();
                }
            }
        }

//        System.out.println("debug: even=" + numEven + ", odd=" + numOdd);
        if (numEven != 0) {
            sum *= Math.pow(2, numEven);
//            System.out.println("debug: sum=" + sum);
        }

        return sum;
    }
}
