import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		
		if(K==0) System.out.println(N*N);
		else{
			for(int i=K+1;i<=N;++i){
				int max = N/i;
				ans += (i-K)*max;
				if(N-max*i>=K) ans += N-max*i-K+1;
			}
			System.out.println(ans);
		}
		return;
	}
}