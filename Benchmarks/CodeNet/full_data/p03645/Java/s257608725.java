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
			Integer a = new Integer(sc.nextInt());
			Integer b = new Integer(sc.nextInt());
			if (a == 1) {
				listA.add(b);
			} else if (b == 1) {
				listA.add(a);
			}
			if (a == n) {
				listB.add(b);
			} else if (b == n) {
				listB.add(a);
			}
			sc.nextLine();
		}
		sc.close();
		String result = "IMPOSSIBLE";
		boolean stopFlag = false;
		for (Integer i : listA) {
			for (Integer j : listB) {
				if (i.intValue() == j.intValue()) {
					result = "POSSIBLE";
					stopFlag = true;
					break;
				}
			}
			if (stopFlag) {
				break;
			}
		}
		System.out.println(result);
	}
}