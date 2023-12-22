import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String s = sc.next();

		final String sList[] = s.split("");

		if (!sList[0].equals("A")) {
			java.lang.System.out.println("WA");
			return;
		}

		int count = 2;
		final int maxcount = s.length() - 2;
		List<String> list = new ArrayList<String>();
		while (count <= maxcount) {
			list.add(sList[count]);
			count++;
		}
		int cCount = 0;
		for (final String item : list) {
			if (item.equals("C")) {
				cCount++;
			}
		}
		if (cCount > 1 || cCount == 0) {
			java.lang.System.out.println("WA");
			return;
		}

		int upperCount = 0;
		for (final String item2 : sList) {
			if (Character.isUpperCase(item2.charAt(0))) {
				upperCount++;
			}

		}

		if (upperCount > 2) {
			java.lang.System.out.println("WA");
			return;
		}

		java.lang.System.out.println("AC");

	}

}
