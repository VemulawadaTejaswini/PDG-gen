import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		boolean isHuiwen = isHuiWen(string);
		System.out.println(isHuiwen? "Yes" : "No");
	}

	private static boolean isHuiWen(String string) {
		int m = (string.length()-1)/2;
		int n = (string.length()+3)/2-1;

		for (int i = 0; i < m; i++) {
			if (string.charAt(i) != string.charAt(string.length()-1-i)) {
				return false;
			}
		}
		for (int i = 0; i < m/2; i++) {
			if (string.charAt(i) != string.charAt(m-1-i)) {
				return false;
			}
		}
		for (int i = n; i < (3 * string.length()-1)/4; i++) {
			if (string.charAt(i) != string.charAt(string.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
