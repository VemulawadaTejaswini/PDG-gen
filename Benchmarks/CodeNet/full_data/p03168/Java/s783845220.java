// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    static double sum ;
    static int n;
    static void check(double arr[] , int i  ,double pro, int h, int t, double dp[][]) {
        if(i>=n) {
            if(h>t) {
                sum = sum + pro;
               // System.out.println(pro+" "+h+" "+t);
                dp[h][t] = sum;
                return ;
            }
            return;
            
        }
        if(dp[h][t]!=-1) {
            sum = dp[h][t];
            return;
        }
        
        check(arr, i+1,pro*arr[i],h+1,t,dp);
        check(arr,i+1,pro*(1-arr[i]),h,t+1,dp);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      
            n = s.nextInt();
            double arr[] = new double[n];
            for (int i = 0 ; i< n  ; i++) {
                arr[i] = s.nextDouble();
            }
            
            sum = 0;
            double dp[][] = new double[n+1][n+1];
            for ( double a[] : dp){
                Arrays.fill(a,-1.0);
            }
            check(arr,0,1,0,0,dp);
            System.out.println(sum);
        
    }
}