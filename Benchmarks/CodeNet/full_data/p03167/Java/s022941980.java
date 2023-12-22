import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        int h = 0, w = 0;
        boolean[][] flag = null;
        try (Scanner scanner = new Scanner(System.in)) {
            h = scanner.nextInt();
            w = scanner.nextInt();
            
            flag = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                String str = scanner.next();
                for(int j = 0; j < w; j++) {
                    if(str.charAt(j) == '.')
                        flag[i][j] = true;
                }
            }
            
        }
        
        // for(boolean [] b : flag)
        //     System.out.println(Arrays.toString(b));
        
        int[][] dp = new int[h][w];
        if(flag[0][0])
            dp[0][0] = 1;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(i == 0 && j ==0)
                    continue;
                if(flag[i][j]) {
                    dp[i][j] = ((i-1>=0?dp[i-1][j]:0) + (j-1>=0?dp[i][j - 1]:0))%(1000*1000*1000 + 7);
                }
            }
        }
        
        // for(int [] b : dp)
        //     System.out.println(Arrays.toString(b));
        
        System.out.println(dp[h-1][w-1]);
        
    }
}