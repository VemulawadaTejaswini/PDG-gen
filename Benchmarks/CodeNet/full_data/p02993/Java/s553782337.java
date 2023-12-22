import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String[] splitArray = S.split("");
		int count = 0;
		for (int j = 0; j < 3; j++) {
			if (splitArray[j].equals(splitArray[j + 1])) {
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

	}
}