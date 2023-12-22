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
		
		int need=0;
		
		//dp[x][y]:=x枚目までで和yを作れるか
		for(int i=0;i<n;i++){
			if(a[i]>k){
				need++;
				continue;
			}
			int idx=0;
			
			boolean[][]dp=new boolean[n][k];
			for(int j=0;j<n;j++){
				dp[j][0]=true;
			}
			
			for(int j=1;j<n;j++){
				if(idx==i)idx++;
				
				for(int sum=0;sum<k;sum++){
					if(dp[j-1][sum]){
						dp[j][sum]=true;
						int temp=sum+a[idx];
						if(temp<k)dp[j][temp]=true;
					}
				}
				
				idx++;
			}
			
			for(int sum=k-a[i];sum<k;sum++){
				if(dp[n-1][sum]){
					need++;
					break;
				}
			}
		}
		System.out.println(n-need);
		
	}
}