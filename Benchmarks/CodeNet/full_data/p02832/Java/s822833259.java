
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		if (!list.contains(1)) {
			System.out.println(-1);
		} else if (n == 1 && list.get(0) == 1) {
			System.out.println(0);
		} else {
			int count = 1;
			
			List<Integer> list2 = new ArrayList<>();
			list2.add(1);
			for (int i = 2; i <= list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) == i && j >= list.lastIndexOf(i - 1) && list2.contains(i - 1)) {
						list2.add(i);
						count++;
						break;
					}
				}
			}
			System.out.println(n - count);
		}
		
	}
}