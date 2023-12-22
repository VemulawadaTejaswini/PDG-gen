import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}
		//listを降順で並び替え
		Collections.sort(list, Collections.reverseOrder());

		//K個足し合わせる
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += list.get(i);
		}

//		for (int i : list) {
//			System.out.println(i);
//		}

		System.out.println(sum);

	}

}