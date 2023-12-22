import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> list = new HashSet<>();
		int persons;
		try (Scanner sc = new Scanner(System.in);) {
			// 最初の一回は空振り
			persons = sc.nextInt();
			sc.nextInt();
			// 1人目
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				list.add(sc.nextInt());
			}
			for (int p = 0; p < persons - 1; p++) {
				int num1 = sc.nextInt();
				Set<Integer> templist = new HashSet<>();
				for (int i = 0; i < num1; i++) {
					templist.add(sc.nextInt());
				}
				list.retainAll(templist);
			}
		}
		System.out.println(list.size());
	}
}