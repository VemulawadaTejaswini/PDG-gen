import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		String n = sc.nextLine();
		String p = sc.nextLine();
		String[] p2 = p.split(" ");
		ArrayList<Integer> p3 = new ArrayList<Integer>();
		for (int i = 0; i < p2.length; i++) {
			p3.add(Integer.valueOf(p2[i]));
		}
		for (int i = 0; i < p3.size() - 2; i++) {
			if (((p3.get(i) < p3.get(i + 1)) && (p3.get(i + 1) < p3.get(i + 2)))
					|| ((p3.get(i) > p3.get(i + 1)) && (p3.get(i + 1) > p3.get(i + 2)))) {
				k++;
			}
		}

		System.out.println(k);
		sc.close();
	}
}