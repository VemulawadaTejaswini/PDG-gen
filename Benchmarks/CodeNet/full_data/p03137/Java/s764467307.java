import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			int X = sc.nextInt();
			list1.add(X);
		}

		list1.sort(null);

		List<Integer> list2 = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < list1.size() - 1; i++) {
			int sub = list1.get(i + 1) - list1.get(i);
			sum += sub;
			list2.add(sub);
		}

		list2.sort(null);

		int sumMax = 0;
		for (int i = 1; i < N; i++) {
			if (list2.size() - i < 0) {
				break;
			}
			sumMax += list2.get(list2.size() - i);
		}

		System.out.println(sum - sumMax);

		sc.close();
	}



}


