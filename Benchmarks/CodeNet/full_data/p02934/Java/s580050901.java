import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		sc.close();

		//処理
		double ans = -1;
		int product = 1;
		int sum = 0;
		for(int i = 0; i < n; i++) product *= a[i];
		for(int i = 0; i < n; i++) sum += product / a[i];
		ans = (double)product / sum;

		//出力
		System.out.println(ans);
	}
}
