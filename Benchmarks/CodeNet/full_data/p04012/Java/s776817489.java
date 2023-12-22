import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		boolean ans = true;
		int count = 0;
		if (w.length() % 2 == 1) {
			ans = false;
		}
		for (int i = 0; i < w.length(); i++) {
			for(int j = 1; j < w.length(); j++) {
				int k = i + j;
				if (k < w.length()) {
					if (w.charAt(i) == w.charAt(k)) {
						count++;
					}
				}
			}
		}
		if (count % 2 == 1) {
			ans = false;
		}
		System.out.println(ans ? "Yes" : "No");
	}
}