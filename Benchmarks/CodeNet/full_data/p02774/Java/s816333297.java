import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A);

            long min = -1000000000L * 1000000000L;
            long max = 1000000000L * 1000000000L;
            long mid = (min + max) / 2;

            while (true) {
                long c = count(A, mid);

                //System.out.println(mid + " : " + c + " (" + min + ", " + max + ")");

                if (c < K * 2) {
                    min = mid;
                } else {
                    max = mid;
                }

                long mid2 = (min + max) / 2;
                if (mid == mid2) {
                    while (true) {
                        c = count(A, mid);
                        if (c >= K * 2) {
                            break;
                        }
                        mid++;
                    }
                    break;
                }

                mid = mid2;
            }

            System.out.println(mid);
        }
    }

    static long count(long[] A, long mid) {
        int N = A.length;

        long c = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                if (mid >= 0) {
                    c += (N - 1);
                }
                continue;
            }

            long m = mid / A[i];

            if (mid < 0) {
                if (mid % A[i] != 0) {
                    if (A[i] < 0) {
                        m++;
                    } else {
                        m--;
                    }
                }
            }

            if (A[i] < 0) {
                int pos = Arrays.binarySearch(A, m);
                if (pos < 0) {
                    pos = -(pos + 1);
                }
                c += (N - pos);
                if (i >= pos) {
                    c--;
                }
            } else {
                int pos = Arrays.binarySearch(A, m + 1);
                if (pos < 0) {
                    pos = -(pos + 1);
                }
                c += pos;
                if (i < pos) {
                    c--;
                }
            }
        }

        return c;
    }

}
