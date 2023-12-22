import java.util.Scanner;

public class Main {
	static boolean checkB[] = { true, true, true, true };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String tmp = null;
		while (true) {
			if(!s.equals(""))
				tmp = whatNext(s);
			if (s.equals("") || tmp == null) {
				if (s.equals(""))
					System.out.println("YES");
				else {
					System.out.println("NO");
				}
				return;
			}

			s = cut(s, tmp);
		}
	}

	static String cut(String tx, String cut) {
		int tmp = tx.indexOf(cut);
		tmp += cut.length();
		try {
			String tmpS = tx.substring(tmp);
			checkIn(tmpS);
			return tmpS;
		} catch (StringIndexOutOfBoundsException e) {
			for (int i = 0; i < 4; i++) {
				checkB[i] = false;
			}
			return "";
		}
	}

	static String whatNext(String tx) {
		try{
		char first = tx.charAt(0);
		if (checkB[0] && first == 'd') {
			// dreamあり
			if (!checkB[2] || tx.charAt(7) == 'a' || tx.charAt(5) == 'd' )
				return "dream";
			else
				return "dreamer";

		} else if (checkB[2] && first == 'e') { // eraseある
			if (tx.charAt(4) == 'e') {
				if (!checkB[0] || tx.charAt(5) == 'r' || tx.charAt(5) == 'e') {
					return "eraser";
				} else {
					return "erase";
				}
			} else {
				checkB[2] = false;
				checkB[3] = false;
				return null;
			}
		} else {
			return null;
		}
		}catch (StringIndexOutOfBoundsException e) {
			return null;
		}
	}
	static void checkIn(String tx) {
		if (checkB[0]) {
			if (!tx.contains("dream")) {
				checkB[0] = false;
				checkB[1] = false;
			}
		}
		if (checkB[1]) {
			if (!tx.contains("dreamer")) {
				checkB[1] = false;
			}
		}
		if (checkB[2]) {
			if (!tx.contains("erase")) {
				checkB[2] = false;
				checkB[3] = false;
			}
		}
		if (checkB[3]) {
			if (!tx.contains("eraser")) {
				checkB[3] = false;
			}
		}
	}
}
