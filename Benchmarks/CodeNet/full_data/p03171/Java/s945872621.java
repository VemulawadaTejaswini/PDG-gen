import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void playGame(long[] sequence) {
        long[][] dp = new long[sequence.length + 1][sequence.length + 1];

        for(int i=1; i<=sequence.length; i++)
            dp[i][i] = sequence[i-1];

        for(int gap= 1; gap<sequence.length; gap++) {

            for(int start = 1, end = start + gap; start <= sequence.length && end <= sequence.length ; start++, end++) {
                dp[start][end] = Math.max(sequence[start-1] - dp[start+1][end], sequence[end-1] - dp[start][end-1]);
            }

        }

        System.out.println(dp[1][sequence.length]);
    }


    public static void playGameMemo(long[] sequence) {
        long[][] memo = new long[sequence.length][sequence.length];
        for(int i=0; i<sequence.length; i++)
            Arrays.fill(memo[i], -1);
        long maxValueAttainable = playGameMemoHelper(sequence, memo, 0, sequence.length - 1);
        long sum = 0;

        for(int i=0; i<sequence.length; i++)
            sum = sum + sequence[i];
        long Y = sum - maxValueAttainable;
        System.out.println(maxValueAttainable - Y);
    }

    private static long playGameMemoHelper(long[] sequence, long[][] memo, int start, int end) {
        if(start > end) {
            return 0;
        }

        if(start == end) {
            return sequence[start];
        }

        if(start + 1 == end) {
            return memo[start][end] = Math.max(sequence[start], sequence[end]);
        }

        if(memo[start][end] != -1) {
            return memo[start][end];
        }

        long state1 = sequence[start] +  Math.min(playGameMemoHelper(sequence, memo, start+2, end), playGameMemoHelper(sequence, memo, start + 1, end - 1));
        long state2 = sequence[end] + Math.min(playGameMemoHelper(sequence, memo, start + 1, end - 1), playGameMemoHelper(sequence, memo, start, end - 2 ));

        return memo[start][end] = Math.max(state1, state2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] sequence = new long[N];

        for(int i=0; i<N; i++) {
            sequence[i] = scanner.nextLong();
        }

        //playGame(sequence);
        playGameMemo(sequence);
    }

}
