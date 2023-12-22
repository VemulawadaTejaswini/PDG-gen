import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (list.contains(a)) {
				list.remove(list.indexOf(a));
			} else {
				list.add(a);
			}
		}

		System.out.println(list.size());

		sc.close();

	}

}