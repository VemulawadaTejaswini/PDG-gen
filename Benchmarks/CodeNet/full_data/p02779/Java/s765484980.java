
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String anser = "Yes";

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			map.put(i, scan.nextInt());
		}

		for (int i = 0; i < N; i++) {
			HashMap<Integer, Integer> clone = (HashMap<Integer, Integer>) map.clone();
			clone.remove(i);
			if (clone.containsValue(map.get(i))) {
				anser = "No";
				break;
			}
		}
		System.out.println(anser);
	}

}
