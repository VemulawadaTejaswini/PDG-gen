import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static String winner(int[] setOfMoves, int K){
        boolean[] dp = new boolean[K+1];
        // false: second player wins
        // true: first player wins
        for (int stones = 0; stones <= K; stones++) {
            for (int choice : setOfMoves)
                if (stones >= choice && !dp[stones - choice]) {
                    dp[stones] = true;
                }
        }

        return dp[K] ? "First" : "Second";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A  = new int[N];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(winner(A, K));
    }
}
