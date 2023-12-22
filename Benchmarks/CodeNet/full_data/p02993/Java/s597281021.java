import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String[] splitArray = S.split("");
		int count = 0;

//		for (int i = 0; i < splitArray.length; i++) {
//			System.out.println(splitArray[i]);
//		}

		for (int j = 0; j < 3; j++) {
//			System.out.println(splitArray[j]);
//			System.out.println(splitArray[j + 1] + "終わり");
			if (splitArray[j].equals(splitArray[j + 1])) {
				count += 1;
				System.out.println(count);
			}
		}
		if (count == 0) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

	}
}