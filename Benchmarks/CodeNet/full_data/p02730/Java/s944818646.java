import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] s  = scanner.nextLine().toCharArray();
		int n     = s.length;
		int mid   = (n - 1) / 2 + 1;
		String an = "Yes";

		for(int i = 0; i < mid; i++) {

			if(s[i] != s[n - i - 1]) {

				an = "No";
				break;
			}
		}

		int mmid = (mid - 1) / 2 + 1;
		int nn   = mid -1;
		for(int i = 0; i < mmid; i++) {

			if(s[i] != s[nn - i - 1]) {

				an = "No";
				break;
			}
		}

		int start = (n + 3) / 2 + n;
		int mmmid = start / 2 + 1;
		for(int i = start; i < mmmid; i++) {

			if(s[i] != s[n - i - 1]) {

				an = "No";
				break;
			}
		}
		System.out.println(an);

	}
}