import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = sc.nextLong();

		String SS = S+S;
		char[] a = S.toCharArray();
		char[] aa = SS.toCharArray();

		// cnt1:文字列１回分の場合の最低変更数
		long cnt1=0;
		int i=0;
		while(i<a.length) {
			if (i>=a.length-1) break;
			if (a[i]==a[i+1]) {
				cnt1++;
				i+=2;
			} else {
				i++;
			}
		}

		// cnt2:文字列２回分の場合の最低変更数
		long cnt2=0;
		i=0;
		while(i<aa.length) {
			if (i>=aa.length-1) break;
			if (aa[i]==aa[i+1]) {
				cnt2++;
				i+=2;
			} else {
				i++;
			}
		}

		// Kが偶数の場合、文字列２回分の最低変更数×Kの半分
		// Kが奇数の場合は更に文字列１回分の最低変更数を加算
		System.out.println(K%2==0 ? cnt2*K/2 : cnt2*(K/2)+cnt1);
	}


}