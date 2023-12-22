import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
		System.out.println(matchToDelete(S));
	}

	enum Word {
		DREAMER, ERASER, DREAM, ERASE
		;
		public String getValue() {
			return reverse(this.name().toLowerCase());
		}
	}

	public static String reverse(String target) {
		char[] orig = target.toCharArray();
		char[] result = new char[orig.length];
		for (int i=orig.length-1;i>=0;i--) {
			result[(orig.length-1)-i] = orig[i];
		}
		return new String(result);
	}

	public static String matchToDelete(String S) {
		S = reverse(S);

		for (Word word:Word.values()) {
			S = S.replace(word.getValue(), "");
		}

		return S.length() == 0 ? "YES" : "NO";
	}

}
