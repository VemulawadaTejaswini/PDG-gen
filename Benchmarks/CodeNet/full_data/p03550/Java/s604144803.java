import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=sc.nextInt();
		int w=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int[][] dp=new int[n+1][2];
		//0は先行、１は後攻
		for(int i=n-1; i>=0; i--){
			int max=0;
			int min=0;
			if(i==0){
				max=Math.abs(w-a[n-1]);
				min=Math.abs(z-a[n-1]);
			}else{
				max=Math.abs(a[i-1]-a[n-1]);
				min=Math.abs(a[i-1]-a[n-1]);
			}
			for(int j=i+1; j<n; j++){
				max=Math.max(dp[j][1],max);
				min=Math.min(dp[j][0],min);
			}
			dp[i][0]=max;
			dp[i][1]=min;
		}
		System.out.println(dp[0][0]);
	}
}
