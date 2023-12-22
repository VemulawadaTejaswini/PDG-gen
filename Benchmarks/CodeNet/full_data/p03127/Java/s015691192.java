import java.util.Arrays;
import java.util.Scanner;

class Problem {
    private int N;
    private int[] A;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
    }

    int solve() {
        Arrays.sort(A);
        while (A[0] > 1) {
            int minMod = A[0];
            int minPos = 0;

            for (int i = 1; i < N; i++) {
                int m = A[i] % A[0];
                if (m > 0 && m < minMod) {
                    minMod = m;
                    minPos = i;
                }
            }

            if (minPos == 0) break;

            A[minPos] = A[0];
            A[0] = minMod;
        }

        return A[0];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
