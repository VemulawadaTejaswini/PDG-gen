import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			ArrayList<Integer> array = new ArrayList<>();
			array.add(a);
			array.add(b);

			ArrayList<Integer> result = new ArrayList<>();
			result.add(1);
			result.add(2);
			result.add(3);

			result.removeAll(array);

			System.out.println(result.get(0));

		}
	}
}
