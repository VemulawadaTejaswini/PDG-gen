import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(a, K));

        sc.close();
    }

    static int solve(int[] a, int K) {
        Arrays.sort(a);

        int lastIndex = -1;
        int lower = 0;
        int upper = a.length - 1;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;

            if (isUnnecessary(a, K, middle)) {
                lastIndex = middle;
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }

        return lastIndex + 1;
    }

    static boolean isUnnecessary(int[] a, int K, int index) {
        if (a[index] >= K) {
            return false;
        }

        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for (int i = 0; i < a.length; ++i) {
            if (i != index) {
                Set<Integer> nextSums = new HashSet<>(sums);
                for (int sum : sums) {
                    int nextSum = sum + a[i];
                    if (nextSum < K) {
                        nextSums.add(nextSum);

                        if (nextSum + a[index] >= K) {
                            return false;
                        }
                    }
                }

                sums = nextSums;
            }
        }

        return true;
    }
}