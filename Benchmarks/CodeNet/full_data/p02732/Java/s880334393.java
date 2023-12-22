import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<Integer> first = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			array[i] = a;
			if (first.contains(a)) {
				if (map.containsKey(a)) {
					int num = map.get(a);
					map.put(a, num + 1);
				} else {
					map.put(a, 2);
				}
			} else {
				first.add(a);
			}
		}
		sc.close();

		long answer = 0;
		for (int value : map.values()) {
			long product = (value * (value - 1)) / 2;
			answer = answer + product;
		}

		for (int i = 0; i < n; i++) {
			int a = array[i];
			if (!map.containsKey(a)) {
				print(answer);
			} else {
				int dup = map.get(a);
				long subtractAns = answer - ((dup * (dup - 1)) / 2) + (((dup - 1) * (dup - 2)) / 2);
				print(subtractAns);
			}
		}

	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}