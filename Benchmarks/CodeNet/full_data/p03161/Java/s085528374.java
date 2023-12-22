import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int h[] =new int[n];
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		int dp[]= new int[n];
		for (int i = 0; i < n; i++) {
		    dp[i]=Integer.MAX_VALUE;
		}
		dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=i+k;j++){
                if(j<n){
                    dp[j]=Math.min(dp[j],dp[i]+Math.abs(h[j]-h[i]));
                }
            }
        }
    }
}