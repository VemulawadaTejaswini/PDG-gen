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

		for (int i = 1; i < list.size() - 1; i++) {

			int temp = list.get(i);
			list.remove(i);
			System.out.println(calc(list));
			list.add(i, temp);
		}
	}

	private static int calc(List<Integer> list) {

		int temp = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			temp += Math.abs(list.get(i + 1) - list.get(i));
		}

		return temp;
	}
}