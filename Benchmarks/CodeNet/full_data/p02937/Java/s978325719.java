import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_E
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		// 文字列を逆順にする
		String SRev = new StringBuffer(S).reverse().toString();
		String TRev = new StringBuffer(T).reverse().toString() + "_";

		int TIndex = 0;
		Long times = (long) 0;
		int mod = -1;

		for(int i=0; i<S.length(); i++) {
			if(SRev.charAt(i) == TRev.charAt(TIndex)) {
				TIndex++;
				if(mod < 0) {
					mod = S.length() - i;
				}
			}
		}

		Boolean Flag = false;

		while(TIndex < T.length()) {

			Flag = false;

			for(int i=0; i<S.length(); i++) {
				if(SRev.charAt(i) == TRev.charAt(TIndex)) {
					TIndex++;
					Flag = true;
				}
			}
			times++;

			if(!Flag) {
				break;
			}
		}

		if(Flag) {
			System.out.println(S.length() * times + mod);
		} else {
			System.out.println(-1);
		}
	}
}
