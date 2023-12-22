
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long X = Long.parseLong(sc.next());
		StringBuilder buf = new StringBuilder();
		String s = "";
		String s1 = "";
		String BP = "BPPPB";
		String sB = "B";
		String sP = "P";


		for(int i=0;i<N-1;i++) {
			buf.append(BP);
		}
		s1 = buf.toString();
		buf.setLength(0);
		buf.append(sB);
		buf.append(s1);
		buf.append(sP);
		buf.append(s1);
		buf.append(sB);
		s = buf.toString();
		buf.setLength(0);

		System.out.println(s);

		long slen = s.length();

		long cnt=0;

		boolean flag = false;
		// Xがsの文字数の半分を超える
		if(slen / 2 < X) {
			flag = true;
		}

			if(X >= 5) {
				cnt = X / 5 * 3;
				if(X % 5 == 1) {
					//cnt -= 1;
				}else if(X % 5 == 2) {

				}else if(X % 5 == 3) {
					cnt += 1;
				}else if(X % 5 == 4) {
					cnt += 2;
				}
			}else {
				if(X == 4) {
					cnt = 2;
				}else if(X == 3) {
					cnt = 1;
				}

			}

		if(flag == true) {
			if((X-(slen / 2 + 1)) % 5 == 0) {
				cnt += 1;

			}
			if((X-(slen / 2 + 1)) % 5 == 4) {
				cnt += 1;

			}
		}

		System.out.println(cnt);

	}

}
