
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		String result1 = "";
		String result2 ="";
		String result3 = "";
		String ans = "No";

		for (int j = 0; j < S.length() ; j++) {

			result1=S.substring(0, j);
			result2=S.substring(j);
			result3=(result2+result1);

			if (result3.equals(T)) {
				ans = "Yes";
				break;
			}
			result1 = "";
			result2 = "";
			result3 = "";

		}
		System.out.println(ans);
		scan.close();

	}
}
