import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int H = in.nextInt();
    int W = in.nextInt();
    in.nextLine();
    //System.out.println(" h "+H+ " W "+W);
    char[][] arr = new char[H][W];
    int[][] dp = new int[H][W];
    int mod = (int)(1e9 + 7);
    
    for(int i = 0; i < H; i++) {
         arr[i] = in.nextLine().toCharArray();
         System.out.println(Arrays.toString(arr[i]));
    }
    
    for(int i = 1; i < W; i++) {
        if(arr[0][i] == '.') {
            dp[0][i] = 1;
        }
        else {
            break;
        }
    }
    
    for(int j = 1; j < H; j++) {
        if(arr[j][0] == '.') {
            dp[j][0] = 1;
        }
        else {
            break;
        }
    }
    
    for(int i = 1; i < H; i++) {
        for(int j = 1; j < W; j++) {
            if(arr[i][j] == '.') {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod;
            }
        }
    }
    
    System.out.println(dp[H-1][W-1]);
    
  }
  
  
}