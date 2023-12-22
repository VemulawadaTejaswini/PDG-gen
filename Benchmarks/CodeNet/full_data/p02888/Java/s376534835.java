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
            
            for (int iMiddle = iLeft + 1; iMiddle < N - 1; iMiddle++) {
                int middle = sticks[iMiddle];
                
                for (int iRight = iMiddle + 1; iRight < N; iRight++) {
                    int right = sticks[iRight];
                    
                    if (isSatisfied(left, middle, right))
                        answer++;
                }
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
