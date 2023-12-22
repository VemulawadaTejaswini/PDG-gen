import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * equeue
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] V = new long[N];
            for (int i = 0; i < N; i++) {
                V[i] = sc.nextLong();
            }

            long max = 0;

            for (int i = 0; i < N; i++) {
                long sum = 0;
                List<Long> minus = new ArrayList<>();

                for (int j = 0; j < K; j++) {
                    if (j < N) {
                        int p = (i + j) % N;
                        long v = V[p];
                        sum += v;

                        if (v < 0) {
                            int pos = Collections.binarySearch(minus, v);
                            if (pos < 0) {
                                pos = -(pos + 1);
                            }
                            minus.add(pos, v);
                        }

                        if (i != 0 && i != N - 1 && p != N - 1 && p >= i) {
                            continue;
                        }
                    }

                    long value = sum;

                    for (int k = j + 1; k < K; k++) {
                        int p = k - j - 1;
                        if (minus.size() <= p) {
                            break;
                        }

                        value -= minus.get(p);
                    }

                    max = Math.max(max, value);

                    //System.out.println(i + " " + j + " " + value + " " + sum + " " + minus);
                }
            }

            System.out.println(max);
        }
    }

}
