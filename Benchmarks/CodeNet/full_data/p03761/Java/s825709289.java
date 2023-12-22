import java.util.Scanner;

public class Main {

	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] av = new int[n][alphabet.length];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				String str2 = String.valueOf(str.charAt(j));
				av[i][search(str2)] += 1;
			}
		}
		for (int j = 0; j < av[0].length; j++) {
			int min = av[0][j];
			for (int i = 1; i < n; i++) {
				if (min > av[i][j]) {
					min = av[i][j];
				}
			}
			for (int i = 0; i < min; i++) {
				System.out.print(alphabet[j]);
			}
		}
	}

	public static int search(String str) {
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}

}