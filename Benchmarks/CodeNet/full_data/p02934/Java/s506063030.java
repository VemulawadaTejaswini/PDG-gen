import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();


		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		double parent = 1;
		double all = 1;
		for (int i = 0; i < n; i++) {
			int a = list.get(i);
			parent = parent * a;
			all = all * a;
		}
		// System.out.println(parent);
		// System.out.println(all);


		double child = 0;

		for (int i = 0; i < n; i++) {
			int a = list.get(i);
			child += (double)(all / a);
		}


		System.out.println(parent / child);

	}
}
