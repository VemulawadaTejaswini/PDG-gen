import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputNum = scanner.nextLine();
		//分割して配列に格納
		String[] digitStr = inputNum.split("");
		long inputNumLength = Long.parseLong(inputNum);

		int sum = 0;
		int maxSum = 0;

		for (String str : digitStr) {
			maxSum += Long.parseLong(str);
		}

		for (int i = 0; i < inputNumLength; i++) {

			inputNum = String.valueOf(inputNumLength - i);
			digitStr = inputNum.split("");

			for (String str : digitStr) {
				sum += Integer.parseInt(str);
			}

			if (maxSum < sum) {
				maxSum = sum;
				sum = 0;
			}
			sum = 0;
		}
		System.out.println(maxSum);
	}

}