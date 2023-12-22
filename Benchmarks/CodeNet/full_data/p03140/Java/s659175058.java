import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String c = scanner.nextLine();


		//aとbを先に置換するパターン。
		int abNumChange = countNumChange(a, b, c, n);
		//aとcを先。
		int acNumChange = countNumChange(a, c, b, n);
		//bとcを先。
		int bcNumChange = countNumChange(b, c, a, n);

		int min = abNumChange;

		if (min > acNumChange) {
			min = acNumChange;
		}

		if (min > bcNumChange) {
			min = bcNumChange;
		}

		System.out.println(min);


	}

	static int countNumChange(String firstStr, String secondStr, String thirdStr, int n) {

		int numChange = 0;

		//置換後の文字列。
		StringBuilder builder = new StringBuilder(n+1);
		builder.append("");
		String after = "";
		for (int i = 0; i < n; i++) {
			String firstSub = firstStr.substring(i, i+1);
			String secondSub = secondStr.substring(i, i+1);
			if (!firstSub.equals(secondSub)) {
				numChange++;
				if (i % 2 == 0) {
					builder.append(firstSub);
				} else {
					builder.append(secondSub);
				}
			} else {
				builder.append(firstSub);
			}
		}

		after = builder.toString();
		for (int i = 0; i < n; i++) {
			String afterSub = after.substring(i, i+1);
			String thirdSub = thirdStr.substring(i, i+1);

			if (!thirdSub.equals(afterSub)) {
				numChange++;
			}
		}


		return numChange;
	}

}
