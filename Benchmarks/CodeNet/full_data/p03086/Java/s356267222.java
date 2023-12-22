import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String b = scanner.next();

		scanner.close();

		List<Character> AGTC = new ArrayList<Character>();
		AGTC.add('A');
		AGTC.add('G');
		AGTC.add('T');
		AGTC.add('C');

		int matchlength = 0;
		int maxlength = 0;

		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (AGTC.contains(c)) {
				matchlength++;
			} else {
				if (maxlength < matchlength) {
					maxlength = matchlength;
				}
				matchlength = 0;
			}
		}

		if (maxlength == 0) {
			System.out.println(matchlength);
		} else {
			System.out.println(maxlength);
		}
	}

}
