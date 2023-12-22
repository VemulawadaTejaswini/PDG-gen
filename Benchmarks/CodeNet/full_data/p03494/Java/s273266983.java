import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			scanner.nextLine();
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < count; i++) {
				int number = scanner.nextInt();
				int result = devide2Count(number);
				if (result < min) {
					min = result;
				}
			}
			System.out.println(min);
		}
	}

	/**
	 * numberが何回2で割れるかを取得する
	 * 
	 * @param number
	 * @return
	 */
	private static int devide2Count(int number) {
		int result = 0;
		while (number % 2 == 0) {
			number = number / 2;
			result++;
		}
		return result;
	}
}