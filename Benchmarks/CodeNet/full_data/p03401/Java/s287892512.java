import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(0);

		for (int i = 0; i < points; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		list.add(0);

		int result = 0;
		int temp = 0;

		for (int i = 1; i < list.size() - 1; i++) {

			for (int j = 0; j < list.size(); j++) {

				if (i == j) {
					continue;
				}

				result += Math.abs(list.get(j) - temp);
				temp = list.get(j);
			}
			System.out.println(result);
			result = 0;
		}
	}
}