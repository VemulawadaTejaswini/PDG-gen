//package atcoderdp;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(find(a,n,k));
    }
    public static int find(int a[],int n,int k){
        int dp[] = new int [n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=Math.abs(a[0]-a[1]);
        for(int i=2;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=Math.min(k,i);j++){
                min = Math.min(min,dp[i-j]+Math.abs(a[i]-a[i-j]));
            }
            dp[i] = min;
        }
      //  System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }
}
