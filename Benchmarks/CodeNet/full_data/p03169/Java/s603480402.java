import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static String longer(String x, String y){
        if(x.length() > y.length()) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zero=0, one=0, two=0, three=0;
        for(int n=0; n<N; n++){
            int a = sc.nextInt();
            switch(a){
                case 0 :
                    zero++;
                    break;
                case 1 :
                    one++;
                    break;
                case 2 :
                    two++;
                    break;
                default:
                    three++;
            }
        }

        double[][][] dp = new double[N+1][N+1][N+1];
        //dp[i][j][k] : when there are 'i' dishes with one sushi
        //                             'j' dishes with two sushi
        //                         and 'k' dishes with three sushi
        dp[0][0][0]=0;


        for(int k=0; k<=three; k++){
            if(k==0){
                for(int j=0; j<=two+three; j++){
                    if(j==0){
                        for(int i=0; i<=N; i++){

                            if(i==0) dp[i][j][k] = 0;
                            else dp[i][j][k] = (N + i*dp[i-1][j][k])/i;
                        }
                    }
                    else {
                        for(int i=0; i<=N; i++){
                            if(i+j+k>N) break;
                            if(i==0) dp[i][j][k] = (N + j*dp[i+1][j-1][k])/j;
                            else dp[i][j][k] = (N + i*dp[i-1][j][k] + j*dp[i+1][j-1][k])/(i+j);
                        }
                    }
                }
            }else{
                for(int j=0; j<=two+three; j++){
                    if(j==0){
                        for(int i=0; i<=N; i++){
                            if(i+j+k>N) break;
                            if(i==0) dp[i][j][k] = (N + k*dp[i][j+1][k-1])/(k);
                            else dp[i][j][k] = (N + i*dp[i-1][j][k] + k*dp[i][j+1][k-1])/(i+k);
                        }
                    }
                    else {
                        for(int i=0; i<=N; i++){
                            if(i+j+k>N) break;
                            if(i==0) dp[i][j][k] = (N + j*dp[i+1][j-1][k] + k*dp[i][j+1][k-1])/(j+k);
                            else dp[i][j][k] = (N + i*dp[i-1][j][k] + j*dp[i+1][j-1][k] + k*dp[i][j+1][k-1])/(i+j+k);
                        }
                    }
                }
            }
        }
        
        System.out.println(dp[one][two][three]);
    }
}
