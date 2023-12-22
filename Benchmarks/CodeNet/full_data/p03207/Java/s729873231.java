import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		int max = 0;
		int price = 0;
		int count = 0;
		int sum = 0;

		try {
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();

			for (int i = 0; i < x; i++) {
				price = scanner.nextInt();
				input.add(price);
				if (max < price) {
					max = price;
					count = i;
				}
			}
			scanner.close();

			for (int i = 0; i < x; i++) {
				if (i == count) {
					sum = sum + input.get(i) / 2;
				} else {
					sum = sum + input.get(i);
				}
			}

			System.out.println(sum);
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}

	}

}
