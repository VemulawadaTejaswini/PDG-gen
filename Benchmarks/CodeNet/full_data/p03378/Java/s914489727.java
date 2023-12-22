import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//全体の長さを入力
		int n = sc.nextInt();
		//料金所の数を設定
		int m = sc.nextInt();
		//初期位置を設定
		int x = sc.nextInt();
		//料金所の位置を設定
		int a[] = new int[m];
		for(int i = 0;i < m;i++) {
			a[i] = sc.nextInt();
		}
		
		//前後別料金所通過のカウント
		int fee = 0;
		int feeb = 0;

		while(true) {
			x++;
			if(x == n) {
				break;
			}
			for(int i = 0;i < m;i++) {
				if(x == a[i]) {
					fee++;
				}
			}
		}
		while(true) {
			x--;
			if(x == 0) {
				break;
			}
			for(int i = 0;i < m;i++) {
				if(x == a[i]) {
					feeb++;
				}
			}
		}
		if(fee > feeb) {
			fee = feeb;
		}
		
		System.out.println(fee);
		sc.close();
	}
}