
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int WIN = 1;
    static int LOSE = 2;

    private static int[] arr;

    private static int[][] memo;

    private static boolean dfs(int K, int isTaro) { // easier to cache, isTaro == 1 if taro
        if (K == 0) {
            return false;
        }
        if (K < 0) {
            return true; // the opponent tried to remove more stones than were in the pile
        }

        if (memo[K][isTaro] > 0) {
            return memo[K][isTaro] == WIN;
        }

        boolean res = false;
        for (int x_stones : arr) {
            if (!dfs(K - x_stones, isTaro ^ 1)) {
                // guaranteed win
                res = true;
                break;
            }
        }


        memo[K][isTaro] = res ? WIN : LOSE;

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(f.readLine());

        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());


        st = new StringTokenizer(f.readLine());

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        // instantiate the memo table:
        memo = new int[K+1][2]; // we need to cache (K, isTaro) combo, hard to hash pair
        // 0: uninitialized, 1: win, 2: lose

        if (dfs(K, 1)){
            System.out.println("First");
        } else {
            System.out.println("Second");
        }


    }
}