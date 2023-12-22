import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		char[] Sprime = s.nextLine().toCharArray();
		char[] T = s.nextLine().toCharArray();
		int SprimeLength = Sprime.length;
		int TLength = T.length;
		boolean matched = false;
		outer: for (int i = Sprime.length - T.length; i >= 0; i--) {
			for (int j = 0; j < TLength; j++) {
				if (Sprime[i + j] != '?' && Sprime[i + j] != T[j]) {
					continue outer;
				}

			}
			for (int j = 0; j < TLength; j++) {
				Sprime[i + j] = T[j];

			}
			matched = true;
			break;

		}
		if (matched) {
			// マッチしました
			for (int i = 0; i < Sprime.length; i++) {
				if (Sprime[i] == '?')
					Sprime[i] = 'a';
			}
			System.out.println(Sprime);
		} else {
			System.out.println("UNRESTORABLE");
		}
	}

}
