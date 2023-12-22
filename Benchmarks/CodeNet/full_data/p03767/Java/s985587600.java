import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		ArrayList<Long> list = new ArrayList<>();
		for(int i = 0; i < 3 * N; i++) {
			list.add(scanner.nextLong());
		}

		Collections.sort(list);

		long sum = 0;
		for(int i = 0; i < N; i++) {
			sum += list.get(2 + (i * 3));
		}

		System.out.println(sum);
	}

}