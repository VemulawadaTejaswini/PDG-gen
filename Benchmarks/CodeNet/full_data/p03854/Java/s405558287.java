import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
		System.out.println(matchToDelete(S));
	}

	enum Word {
		DREAMERDREAMER, DREAMERERASER, DREAMERDREAM, DREAMERERASE,
		ERASERDREAMER , ERASERERASER , ERASERDREAM , ERASERERASE,
		DREAMDREAMER, DREAMERASER,  DREAMDREAM, DREAMERASE,
		ERASEDREAMER, ERASEERASER, ERASEDREAM, ERASEERASE,
		DREAMER, ERASER, DREAM, ERASE
		;

		public String getValue() {
			return this.name().toLowerCase();
		}
	}

	public static String matchToDelete(String S) {
		for (Word word:Word.values()) {
			S = S.replace(word.getValue(), "");
		}

		return S.length() == 0 ? "YES" : "NO";
	}

}
