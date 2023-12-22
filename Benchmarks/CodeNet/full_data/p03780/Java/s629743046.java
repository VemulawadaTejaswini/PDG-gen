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
		Arrays.sort(a);
		
		//二分探索
		int ans=-1;
		int max=n;
		int min=0;
		int i=0;
		LOOP:while(min<max){
			i=(max+min)/2;
			
			if(a[i]>k){
				max=i;
				continue;
			}
			int idx=0;
			
			//dp[j][sum]:=j枚目までで和sumを作れるか
			boolean[][]dp=new boolean[n][k];
			for(int j=0;j<n;j++){
				dp[j][0]=true;
			}
			
			for(int j=1;j<n;j++){
				if(idx==i)idx++;	//i枚目は使わないので
				
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
					max=i;
					continue LOOP;
				}
			}
			ans=i;
			min=i+1;
		}
		System.out.println(ans+1);
	}
}
