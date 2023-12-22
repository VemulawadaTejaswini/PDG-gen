import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		//処理
		int ans = 0;
		int x = 0;
		for(int i = 0; i < n; i++){
			if(s.charAt(i) == 'I') x++;
			else x--;
			ans = Math.max(ans, x);
		}

		//出力
		System.out.println(ans);
	}
}
