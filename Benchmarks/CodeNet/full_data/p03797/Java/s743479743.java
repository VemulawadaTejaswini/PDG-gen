import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		//処理
		long ans = 0;
		if(2*n >  m) ans = m/2;
		else ans = n + (m-2*n)/4;

		//出力
		System.out.println(ans);
	}
}
