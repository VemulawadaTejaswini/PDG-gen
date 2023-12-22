import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();
        long[] h=new long[n],b=new long[n];
        long[] dp=new long[n];
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                h[i]=scan.nextLong();
        }
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                b[i]=scan.nextLong();
            dp[i]=b[i];
        }
        long max=dp[0];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(h[j]<h[i] && dp[j]+b[i]>dp[i]){
                    dp[i]=dp[j]+b[i];
                }
            }
            max=Math.max(dp[i],max);
        }
        System.out.println(max);

    }
}
