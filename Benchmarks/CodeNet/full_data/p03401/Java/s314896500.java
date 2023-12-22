import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		a.add(0);

		for (int i = 1; i < n + 1; i++) {
			int temp = a.remove(i);
			int cost = 0;
			for (int j = 0; j + 1 < a.size(); j++) {
				cost += Math.abs(a.get(j) - a.get(j + 1));
			}
			System.out.println(cost);
			a.add(i, temp);
		}
	}

}
