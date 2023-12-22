import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();	//N個のボール
		long k=sc.nextLong();	//整数K
		int m=0;	//最大値
		int g=0;	//最大公約数
		String ans;	//答え

		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			g=gcd(g,a);	//最大公約数を更新
			m=Math.max(a,m);	//最大値も更新
		}

		if(k%g==0 && k<=m) ans="POSSIBLE";
		else ans="IMPOSSIBLE";

		System.out.println(ans);
	}
	static int gcd(int a, int b) {
		return b>0 ? gcd(b, a%b) : a;
	}
}