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
		int ans = 0;
		boolean[] dup = new boolean[100001];
		for(int i = 0; i < 100001; i++) dup[i] = false;
		for(int i = 0; i < n; i++){
			if(dup[a[i]]) ans++;
			else dup[a[i]] = true;
		}

		//出力
		System.out.println(n - 2*((ans+1)/2));
	}
}
