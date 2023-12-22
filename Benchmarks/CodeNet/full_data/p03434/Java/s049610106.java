import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(stdin.nextInt());
		}

		Collections.sort(list);
		Collections.reverse(list);
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < list.size(); i += 2) {
			sumA += list.get(i);
		}
		for (int i = 1; i < list.size(); i += 2) {
			sumB += list.get(i);
		}

		System.out.println(sumA - sumB);
	}

}
