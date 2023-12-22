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
		
		
		int count=0;
		
		for(int i=0;i<n;i++){ //i枚目を使わずに
			
			//dp[x][y]:=x枚目までで和yを作れるか
			boolean[][]dp=new boolean[n][k];
			for(int j=0;j<n;j++){
				dp[j][0]=true;
			}
			Arrays.sort(a);
			
			for(int j=0;j<n;j++){
				if(i!=j){
					if(j==0){
						for(int sum=a[j+1];sum<k;sum++){
							if(dp[j][sum-a[j+1]] || dp[j][sum]){
								dp[j+1][sum]=true;
							}
						}
					}else{
						for(int sum=a[j];sum<k;sum++){
							if(dp[j-1][sum-a[j]] || dp[j-1][sum]){
								dp[j][sum]=true;
							}
						}
					}
				}
			}
			boolean flag=false;
			if(a[i]>=k)flag=true;
			else{
				for(int sum=k-a[i];sum<k;sum++){
					if(dp[n-2][sum]){
						flag=true;
					}
				}
			}
			if(!flag)count++;
		}
		System.out.println(count);
	}
}
