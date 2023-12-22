import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashMap<Integer, Integer> kamikire = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (kamikire.containsKey(num)) {
				int value = kamikire.get(num);
				kamikire.put(num, ++value);
			} else {
				kamikire.put(num, 1);
			}
		}
		int counter = 0;
		for (int i : kamikire.keySet()) {
			if (kamikire.get(i) % 2 != 0) {
				counter++;
			}
		}
		System.out.println(counter);

	}
}
