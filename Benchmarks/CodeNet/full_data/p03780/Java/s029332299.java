import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int n,k;
	int[]a;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		//dp[x][y]:=x枚目までで和kを作れるか
		boolean[][]dp=new boolean[n][k];
		for(int i=0;i<n;i++){
			dp[i][0]=true;
		}
		Arrays.sort(a);
		
		int count=0;
		LOOP:for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				for(int sum=a[j];sum<k;sum++){
					if(dp[j-1][sum-a[j]])dp[j][sum]=true;
				}
			}
			
			for(int sum=Math.max(k-a[i], 0);sum<k;sum++){
				if(dp[i][sum]){
					continue LOOP;
				}
			}
			count++;
			
		}
	
		
		System.out.println(count);
	}
}