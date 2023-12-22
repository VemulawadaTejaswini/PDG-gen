import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] a = new String[]
				{"a", "b", "c", "d", "e", "f", "g", "h",
						"i", "j", "k", "l", "m", "n",
						"o", "p", "q", "r", "s", "t",
						"u", "v", "w", "x", "y", "z"};
		int before = 0;
		int after = 0;
		int i = 0;
		for(i = 0; i < 26; i++) {
			before = s.length();
			s = s.replace(a[i], "");
			after = s.length();
			if(before == after) {
				break;
			}
		}
		if(i == 26) {
			System.out.println("None");
		} else {
			System.out.println(a[i]);
		}
	}
}