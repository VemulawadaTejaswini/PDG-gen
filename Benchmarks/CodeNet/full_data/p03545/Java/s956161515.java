import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputString = input.split("");
		int[] inputInt = new int[4];
		for (int i = 0; i < inputString.length; i++) {
			inputInt[i] = Integer.parseInt(inputString[i]);
		}
		String[][] op = { { "+", "+", "+" }, { "+", "+", "-" }, { "+", "-", "+" }, { "+", "-", "-" }, { "-", "+", "+" },
				{ "-", "+", "-" }, { "-", "-", "+" }, { "-", "-", "-" } };
		for (String[] strArray : op) {
			int sum = inputInt[0];
			for (int i = 0; i < strArray.length; i++) {
				if ("+".equals(strArray[i])) {
					sum += inputInt[i + 1];
				} else {
					sum -= inputInt[i + 1];
				}
			}
			if (sum == 7) {
				System.out.print(inputInt[0]);
				for (int i = 0; i < strArray.length; i++) {
					System.out.print(strArray[i]);
					System.out.print(inputInt[i + 1]);
				}
				System.out.print("=7");
				break;
			}
		}
	}
}
