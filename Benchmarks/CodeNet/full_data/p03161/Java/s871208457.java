import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N+1];
        h[0] = 0;

        for(int i=1;i<=N;++i)
            h[i] = sc.nextInt();

        System.out.println(solution(N, K, h));
    }

    private static int solution(int n, int k, int[] heights) {
        int[] A = new int[n+1];
        A[0] = 0;
        A[1] = heights[1-1];
        A[2] = Math.abs(heights[2] - heights[1]);

        for(int i=3;i<n+1;++i) {
            Integer[] possibilities = new Integer[k];
            for(int j=0;j<k;++j)
                possibilities[j] = 0;
            for(int j=0;j<k;++j) {
                if (i-j-1 < 0)
                    break;
                possibilities[j] = Math.abs(heights[i] - heights[i - j - 1]) + A[i - j - 1];
            }

            A[i] = Collections.min(Arrays.asList(possibilities));
        }

        return A[n];
    }
}
