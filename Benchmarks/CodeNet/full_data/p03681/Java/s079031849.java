import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		new Main().solve();
	}
	
	int MOD=1000000000+7;
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		long ans;
		
		if(Math.abs(N-M)>1)System.out.println(0);
		else if(Math.abs(N-M)==1){
			ans=kaijou(N)*kaijou(M)%MOD;
			System.out.println(ans);
		}else if(N==M){
			ans=kaijou(N)*kaijou(M)*2%MOD;
			System.out.println(ans);
		}
	}
	long kaijou(int n){
		long ans=1;
		for(int i=1;i<=n;i++){
			ans*=i;
			ans%=MOD;
		}
		return ans;
	}
	
}