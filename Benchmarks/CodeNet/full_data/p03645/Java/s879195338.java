import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapB = new HashMap<Integer, Integer>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				if (mapB != null && mapB.get(b) != null) {
					System.out.println("POSSIBLE");
					sc.close();
					return;
				}
				mapA.put(b, b);
			} else if (a == n) {
				mapB.put(b, b);
			}
			if (b == 1) {
				if (mapA != null && mapA.get(a) != null) {
					System.out.println("POSSIBLE");
					sc.close();
					return;
				}
				mapA.put(a, a);
			} else if (b == n) {
				mapB.put(a, a);
			}
			sc.nextLine();
		}
		sc.close();
		String result = "IMPOSSIBLE";
		for (int i : mapA.keySet()) {
			if (mapB.get(i) != null) {
				result = "POSSIBLE";
				break;
			}
		}
		System.out.println(result);
	}
}