import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int b,c,d,e,f,k,l,m,n,x,y,z;
	int[] a;
	int[] ans;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		a = new int[n+1];
		ans = new int[n+1];
		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
		}

		for(int s=n;s>0;s--){
			for(int t=s*2;t<n;t+=s){
				ans[s] = ans[s]^ans[t];
			}
			ans[s] = ans[s]==a[s]?ans[s]:ans[s]^1;
		}

		// 出力
		for(int i=1;i<=n;i++)
			m+=ans[i];

		System.out.println(m);
		for(int i=1;i<=n;i++)
			if(ans[i]==1)System.out.println(i);
	}

	public static void main(String[] args){
		new Main();
	}
}