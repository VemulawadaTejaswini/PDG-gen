import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = Long.parseLong(sc.next());

		sc.close();

		ArrayList<Integer> charLList = new ArrayList<Integer>();
		char lastChar = '0';
		int charL = 1;
		boolean sameChar = true;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == lastChar) {
				charL++;
			} else {
				if(sameChar && i != 0) sameChar = false;
				if (charL >= 2) {
					charLList.add(charL);
				}
				charL = 1;
				lastChar = S.charAt(i);
			}
		}
		if (charL >= 2) {
			charLList.add(charL);
		}

		if(sameChar) {
			System.out.println(S.length() * K / 2);
			return;
		}


		if (S.charAt(0) == S.charAt(S.length() - 1)) {
			long naka = 0L;
			for(int i = 1;i < charLList.size() - 1;i++) {
				naka += charLList.get(i) / 2;
			}
			long tunagi = (charLList.get(0) + charLList.get(charLList.size() - 1)) / 2;
			long tl = charLList.get(0) / 2 + charLList.get(charLList.size() - 1) / 2;
			long ret = tl + naka * K + tunagi * (K - 1);
			System.out.println(ret);
		} else {
			long ret = 0;
			for(int i = 0;i < charLList.size();i++) {
				ret += charLList.get(i) / 2;
			}
			System.out.println(ret * K);

		}


	}
}
