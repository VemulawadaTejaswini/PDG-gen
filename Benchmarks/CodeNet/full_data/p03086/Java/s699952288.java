
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.nextLine();
		int length = 0;
		int max = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T') {
				length++;
				if (max < length) {
					max = length;
				}
			} else {
				length = 0;
			}
		}
		System.out.println(max);
		scan.close();
	}
}
