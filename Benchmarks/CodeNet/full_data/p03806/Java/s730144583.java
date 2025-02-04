import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
 
 public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n, ma, mb;
        String[] ss = s.split(" ");
        n = Integer.parseInt(ss[0]);
        ma = Integer.parseInt(ss[1]);
        mb = Integer.parseInt(ss[2]);
        
        int dp[][] = new int[500][500];
     
        for(int i = 0;i<500;i++){
            for(int j = 0;j<500;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int suma = 0;
        int sumb = 0;
        dp[0][0] = 0;
        for(int i = 0;i<n;i++){
            s = br.readLine();
            ss = s.split(" ");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = Integer.parseInt(ss[2]);
            suma += a;
            sumb += b;
            for(int j = 499;j>=0;j--){
                for(int k = 499;k>=0;k--){
                    if(dp[j][k] == Integer.MAX_VALUE) continue;
                    int x = j+a;
                    int y = k+b;
                    if(x<500 && y<500) dp[x][y] = Math.min(dp[j][k] + c, dp[x][y]);
                }
            }
        }
        int p = ma + mb;
        int min = Integer.MAX_VALUE;
        for(int i = ma;i<=suma;i+=ma){
            int x = i;
            int y = (int)((i*mb)/ma);
            if(y<=sumb){
                min = Math.min(dp[x][y], min);
            }
        }
     if(min == Integer.MAX_VALUE) min = -1;
        System.out.println(min);
   }
}
