
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int[] count = new int[4];
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'N') {
				count[0]++;
			} else if (c == 'W') {
				count[1]++;
			} else if (c == 'S') {
				count[2]++;
			} else if (c == 'E') {
				count[3]++;
			}
		}
		String ans = "No";
		if ((count[0] > 0 && count[2] > 0) || (count[0] == 0 && count[2] == 0)) {
			if ((count[1] > 0 && count[3] > 0) || (count[1] == 0 && count[3] == 0)) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
		in.close();
	}
}