import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				list.add(0, array[i]);
			} else {
				list.add(array[i]);
			}
		}

		if (n % 2 == 1) {
			for (int i = 0; i < n; i++) {
				System.out.print(list.get(i));
				System.out.print(" ");
			}
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print(list.get(n-1-i));
				System.out.print(" ");
			}
		}
	}
}