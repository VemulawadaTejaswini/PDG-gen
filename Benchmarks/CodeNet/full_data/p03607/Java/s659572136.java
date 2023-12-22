import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			hm.put(a, hm.getOrDefault(a, 0) + 1);
		}

		int count = 0;
		for (int key : hm.keySet()) {
			if (hm.get(key) % 2 == 1) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}