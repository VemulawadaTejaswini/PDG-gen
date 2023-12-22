import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(h[0]-h[1]);
        for(int i=2;i<n;i++){
            dp[i]=min(h,dp,i,k);
        }
        System.out.println(dp[n-1]);
    }
    public static int min(int[] h,int[] dp,int i,int k){
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(i-j>=0) {
                int temp=dp[i-j]+Math.abs(h[i]-h[i-j]);
                if(temp<min)min=temp;
            }
            else break;
        }
        return min;
    }
    public static int setBit(long n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}