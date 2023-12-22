import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		boolean kisuuflg = false;
		int sousakaisuu = 0;

		while (sc.hasNext()) {
			al.add(sc.nextInt());
		}
		while (true) {
			for (int i = 0; i < al.size(); i++) {
				// System.out.println(al.get(i));
				if (al.get(i) % 2 != 0) {
					// 奇数発見
					kisuuflg = true;
					break;
				} else {

				}
			}
			if (kisuuflg == true) {
				break;
			} else {
				sousakaisuu++;
			}
			for (int i = 0; i < al.size(); i++) {
				al.set(i, al.get(i) / 2);
			}
		}
		System.out.println(sousakaisuu + "回操作できます！");
	}
}