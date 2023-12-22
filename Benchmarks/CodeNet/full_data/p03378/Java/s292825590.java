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
		//料金・通過のカウント
		int move = 0;
		int fee = 0;
		//料金所の位置と料金設定
		int a[] = new int[n+1];
		for(int i = 0;i < m;i++) {
			move = sc.nextInt();
			a[move] = 1;
		}
		//前後別の試行
		for(int i = x;i < n;i++) {
			fee = fee + a[i];
		}
		//一時置き換え
		move = fee;
		fee = 0;
		for(int i = x;i > 0;i--) {
			fee = fee + a[i];
		}
		//どちらが少ないかを判定
		if(move > fee) {
			move = fee;
		}
		//出力
		System.out.println(move);
		sc.close();
	}
}