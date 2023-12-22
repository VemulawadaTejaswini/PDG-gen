
import java.io.*;
import java.util.*;

/**
 *
 * Let dp[mask] be the number of ways to find graph matchings between 1,..,x to mask
 * Where x is # of bits in mask
 * For all x,v connected and v in mask
 * We get dp[mask^(1<<v)] ways 
 */
public class Main {

    static int MOD=1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        boolean[][] arr=new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if(Integer.parseInt(st.nextToken())==1){
                    arr[i][j]=true;
                }
            }
        }
        int[] dp=new int[1<<N];  dp[0]=1;int x=0;
        for (int mask = 1; mask < (1<<N); mask++) {
            x=-1;
            for (int j = 0; j < N; j++) {
                if((mask&(1<<j))>0){
                    x++;
                }
            }
            //Go from x to x-1
            for (int i = 0; i < N; i++) {
                if((mask&(1<<i))>0 && arr[i][x]){
                    dp[mask]+=dp[mask^(1<<i)];
                    dp[mask]%=MOD;
                }
            }
        }
        System.out.println(dp[(1<<N)-1]);
    }
    
}
