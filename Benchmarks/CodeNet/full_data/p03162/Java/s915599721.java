import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] act = new int[N][3];
        
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            act[i][0] = Integer.parseInt(input[0]);
            act[i][1] = Integer.parseInt(input[1]);
            act[i][2] = Integer.parseInt(input[2]);
        }
        
        System.out.println(getMaxPoints(act));
    }

    private static int getMaxPoints(int[][] act) {
        int[] dp1 = new int[3];
        int[] dp2 = new int[3];
        
        for(int i=0; i<dp1.length; i++) {
            dp1[i] = act[0][i];
        }
        
        copyArray(dp1, dp2);
        
        for(int i=1; i<act.length; i++) {
            dp1[0] = act[i][0] + Math.max(dp2[1], dp2[2]);
            dp1[1] = act[i][1] + Math.max(dp2[0], dp2[2]);
            dp1[2] = act[i][2] + Math.max(dp2[0], dp2[1]);
            
            copyArray(dp1, dp2);
        }

        return Math.max(dp1[0], Math.max(dp1[1], dp1[2]));
    }
    
    private static void copyArray(int[] dp1, int[] dp2) {
        for(int i=0; i<dp1.length; i++) {
            dp2[i] = dp1[i];
        }
    }
}
