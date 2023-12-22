import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cnt = new int[1000];
		for(int i=2;i<=n;i++){
			int a = i, d = 2;
			while(a>1){
				if(a%d==0){
					cnt[d]++;
					a/=d;
				}
				else{
					d++;
				}
			}
		}
		
		long ans = 1;
		for(int i=2;i<cnt.length;i++){
			if(cnt[i]>0){
				ans*=(cnt[i]+1);
				ans%=1000000007;
			}
		}
		
		System.out.println(ans);
	}

}
