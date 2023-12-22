import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        int[] sticks = scanSticks(sc, N);
        Arrays.sort(sticks);

        long answer = 0;

        for (int iLeft = 0; iLeft < N - 2; iLeft++) {
            int left = sticks[iLeft];

            int iMiddle = iLeft + 1;
            int iRight = iLeft + 2;
            int middle = sticks[iMiddle];
            int right = sticks[iRight];

            while (true) {
                if (isSatisfied(left, middle, right)) {
                    if (iRight != N - 1) {
                        answer++;
                        right = sticks[++iRight];
                    }
                    else {
                        answer += iRight - iMiddle;
                        break;
                    }
                }
                else if (iMiddle + 1 == iRight) {
                    if (iRight != N - 1) {
                        middle = sticks[++iMiddle];
                        right = sticks[++iRight];
                        continue;
                    }
                    break;
                }
                else
                    middle = sticks[++iMiddle];
            }
        }

        System.out.println(answer);
    }

    private static int[] scanSticks(Scanner sc, final int N) {
        int[] sticks = new int[N];

        for (int i = 0; i < N; i++)
            sticks[i] = sc.nextInt();

        return sticks;
    }

    private static boolean isSatisfied(int left, int middle, int right) {
        return left + middle > right;
    }
}