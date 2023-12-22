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

            for (int a = 0; a <= N; a++) {
                for (int b = 0; b <= N - a; b++) {
                    if (a + b > K) {
                        break;
                    }

                    long value = 0;
                    List<Long> minus = new ArrayList<>();

                    for (int i = -b; i < a; i++) {
                        long v = V[(N + i) % N];
                        value += v;

                        if (v < 0) {
                            int pos = Collections.binarySearch(minus, v);
                            if (pos < 0) {
                                pos = -(pos + 1);
                            }
                            minus.add(pos, v);
                        }
                    }

                    for (int i = 0; i < K - a - b; i++) {
                        if (minus.size() <= i) {
                            break;
                        }

                        value -= minus.get(i);
                    }

                    max = Math.max(max, value);
                }
            }

            System.out.println(max);
        }
    }

}
