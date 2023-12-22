import java.math.BigDecimal;
import java.util.Scanner;

// https://atcoder.jp/contests/abc158/tasks/abc158_bb
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String A = sc.next();
		String B = sc.next();
		sc.close();

		BigDecimal zero = new BigDecimal(0);
		BigDecimal first = new BigDecimal(1);
		BigDecimal bigN = new BigDecimal(N);
		BigDecimal bigA = new BigDecimal(A);
		BigDecimal bigB = new BigDecimal(B);
		String str = "";
		for(BigDecimal i = zero;i.compareTo(bigN)<0;i = i.add(first)) {
			if(bigA.compareTo(zero)!=0) {
				str = str + "b";
				bigA = bigA.subtract(first);
			}else if(bigB.compareTo(zero)!=0) {
				str = str + "a";
				bigB = bigB.subtract(first);
			}
			if(bigA.compareTo(zero)==0&&bigB.compareTo(zero)==0) {
				bigA = new BigDecimal(A);
				bigB = new BigDecimal(B);
			}
		}


		str = str.replace("a", "");
		int ans = str.length();
		System.out.println(ans);
	}
}
