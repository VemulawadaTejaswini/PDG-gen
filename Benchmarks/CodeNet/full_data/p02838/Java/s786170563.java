import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[][] kk=new boolean[n][61];
		long mod=1000000007;
		for(int i=0; i<n; i++){
			long s=sc.nextLong();
			for(int j=60; j>=0; j--){
				if((s & 1)==1){
					kk[i][j]=true;
				}else{
					kk[i][j]=false;
				}
				s>>=1;
			}
		}
		long[][] sum=new long[n+1][61];
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<=60; j++){
				if(kk[i][j]){
					sum[i][j]=sum[i+1][j]+1;
				}else{
					sum[i][j]=sum[i+1][j];
				}
			}
		}
		long ans=0;
		for(int i=0; i<n; i++){
			long count=1;
			for(int j=60; j>=0; j--){
				if(kk[i][j]){
					ans+=(n-1-i-sum[i+1][j])*count;
				}else{
					ans+=sum[i+1][j]*count;
				}
				count*=2;
				ans%=mod;
				count%=mod;
			}
		}
		System.out.println(ans);
	}
}
