import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int K = scanner.nextInt();

		List<Integer> list1 = new ArrayList<>();

		//小さいほうからK番目以内
		for (int i = A; i < A + K; i++) {
			//A 以上 B 以下の整数
			if (i >= A && i <= B) {
				list1.add(i);
			}
		}

		List<Integer> list2 = new ArrayList<>();

		//大きいほうからK番目以内
		for (int i = B; i > B - K; i--) {
			//A 以上 B 以下の整数
			if (i >= A && i <= B) {
				list2.add(i);
			}
		}

		List<Integer> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);

		//昇順に並び替え、重複削除
		List<Integer> x = new ArrayList<>(new TreeSet<>(list));

		for (int i : x) {
			System.out.println(i);
		}

	}
}