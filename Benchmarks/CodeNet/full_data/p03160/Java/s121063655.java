import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class Main {

    static int[] jumps;
    static int oo = Integer.MAX_VALUE;
    static int[] memo;
    
    
    public static int dp(int i, int N) {
        if (i == N-1) {
            return 0;
        }

        if(memo[i] != -1){
            return memo[i];
        }
        
        int sA= oo, sB = oo;
        if (i + 1 < N) {

            sA = Math.min(oo, dp(i + 1, N) + Math.abs(jumps[i] - jumps[i + 1]));
            //System.out.println("A" + jumps[i] + ", " + jumps[i+1]  + ":" + sA);
        }
        if (i + 2 < N) {

            sB = Math.min(oo, dp(i + 2, N) + Math.abs(jumps[i] - jumps[i + 2]));
            //System.out.println("B" + jumps[i] + ", " + jumps[i+1]);
            
        }
        //System.out.println("escoge = "+ Math.min(sA, sB));
        return memo[i] = Math.min(sA, sB);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N];
        
        Arrays.fill(memo, -1);
        
        jumps = Arrays.stream(br.readLine().split(" ")).mapToInt((x) -> Integer.parseInt(x)).toArray();
        System.out.println(dp(0, N));

    }

}
