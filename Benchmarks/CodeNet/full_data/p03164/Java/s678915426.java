import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),w=s.nextInt();
        int[][] arr=new int[n+1][2];
        long[] dp=new long[100001];
        Arrays.fill(dp,(long)1e13); dp[0]=0;
        //dp[i] hold- minimum wt needed to get i values 
        for(int i=1;i<=n;i++){
            arr[i][0]=s.nextInt(); arr[i][1]=s.nextInt();
        }

        for(int i=1;i<=n;i++){
            for(int j=100000;j>=1;j--){
                if(arr[i][1]<=j){
                    dp[j]=Math.min(dp[j],arr[i][0]+dp[j-arr[i][1]]);
                }
                //else{dp[j]=(long)1e13;}
            }
        }
        int res=0;
        for(int i=1;i<100001;i++){
            if(dp[i]<=w){res=i;}
        }       
        System.out.println(res);
    }
}