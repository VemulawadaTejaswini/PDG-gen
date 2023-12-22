import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				if (listB.contains(b)) {
					System.out.println("POSSIBLE");
					return;
				}
				listA.add(b);
			} else if (a == n) {
				listB.add(b);
			}
			if (b == 1) {
				if (listA.contains(a)) {
					System.out.println("POSSIBLE");
					return;
				}
				listA.add(a);
			} else if (b == n) {
				listB.add(a);
			}
			sc.nextLine();
		}
		sc.close();
		String result = "IMPOSSIBLE";
		for (int i : listA) {
			if (listB.contains(i)) {
				result = "POSSIBLE";
				break;
			}
		}
		System.out.println(result);
	}
}