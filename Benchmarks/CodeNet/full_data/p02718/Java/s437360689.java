import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 0, sum = 0, cnt = 0, e = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> eleList = new ArrayList<>();
		while (cnt < 2) {
			cnt++;
			row = sc.nextInt();
			list.add(row);
		}
		cnt = 0;
		//総得票数格納
		for (int i = 0; i < list.get(0); i++) {
			e = sc.nextInt();
			eleList.add(e);
			sum = sum + e;
		}
		for (int i = 0; i < list.get(0); i++) {
			if (sum / (4 * list.get(1)) < eleList.get(i)) {
				cnt++;
			}
		}
		System.out.println(list.get(1) < cnt ? "Yes" : "No");
	}
}
