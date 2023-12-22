import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//切られた羊羹の数
		long [] s = new long[n + 1];	//累積和用の配列
		for(int i = 1;i <= n;i ++) {
			s[i] = sc.nextLong();
			s[i] += s[i - 1];	//累積和を取る
		}
		int l = 1,r = 3;	//左（中央）右の切込みを入れるところ
		long ans = s[n];	//MAX-MINの値
		for(int i = 2;i < n - 1;i ++) {	//中央の切り口
			long last = s[n];	//一時的な変数
			while(l < i) {		//左の切り口は必ず中央よりも左にある
				long d = Math.abs(s[i] - s[l] * 2);	//左から1番目の羊羹と左から2番めの羊羹の長さの差の絶対値
				if(d > last) break;	//あるところまでは単調減少だが、あるところから単調増加に転じるので、単調増加に転じ始めたらそれ以降が答えになることはありえないのでそこで探索を切る
				else last = d;		//単調減少のときは、できるだけ差をちいさくすべく、値を更新する
				l ++;	//どんどん切り口を右に寄せる
			}
			l --;	//単調増加に転じはじめたところにlがなっているので1減らして、ギリギリ単調減少のところまで戻す
			last = s[n];		//一時的な変数
			while(r < n) {		//右側も同様　必ず、右の切り口は中央よりも右に存在する
				long d = Math.abs(s[n] + s[i] - s[r] * 2);	//右から1番目の羊羹と、右から2番めの羊羹の差の絶対値
				if(d > last) break;	//単調増加になったらやめる
				else last = d;	//そうでなければ更新
				r ++;	//切り口を右にやる
			}
			r --;	//単調増加してしまったものを単調減少まで戻す
			long max = Math.max(Math.max(Math.max(s[l], s[i] - s[l]), s[r] - s[i]), s[n] - s[r]);
			long min = Math.min(Math.min(Math.min(s[l], s[i] - s[l]), s[r] - s[i]), s[n] - s[r]);
			ans = Math.min(max - min, ans);	//答えの更新
		}
		System.out.println(ans);	//答えの出力
	}
}
