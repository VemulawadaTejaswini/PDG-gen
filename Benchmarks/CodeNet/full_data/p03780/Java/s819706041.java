import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int N;
	static int K;
	static int[] a=new int[N];
	static int sum=0;
	static int[] flag=new int[N];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[]a=new int[N+1];
		for(int i=0;i<N;i++)a[i+1]=sc.nextInt();
		Arrays.sort(a);
		int n=N;
		for(int i=1;i<=N;i++){
			if(a[i]>=K)n=i-1;
		}
		boolean[][] dp=new boolean[N+1][K+a[n]+1];
		for(int i=0;i<=N;i++){
			dp[i][0]=true;
		}
		for(int i=0;i<n;i++){
			for(int j=a[i+1];j<=K+a[i+1];j++){
				if(dp[i][j-a[i+1]]==true)dp[i+1][j]=true;
			}
		}
		
		int ans=0;
		for(int i=1;i<=n;i++){
			int count=0;
			for(int j=K-a[i];j<K;j++){
				if(dp[i][j])count++;
			}
			if(count==0)ans++;
		}
		System.out.println(ans);
	}

}
