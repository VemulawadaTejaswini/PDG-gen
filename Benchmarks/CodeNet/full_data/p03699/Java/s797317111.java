import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N;
	int[]s;
	int sum=0;
	int Max=0;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		s=new int[N];
		for(int i=0;i<N;i++){
			s[i]=sc.nextInt();
		}
		
		dfs(0);
		System.out.println(Max);
	}
	void dfs(int n){
		if(n==N){
			if(sum%10!=0) Max=Math.max(Max, sum);
		}else{
			sum+=s[n];
			dfs(n+1);
			
			sum-=s[n];
			dfs(n+1);
		}
	}
}
