import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			int head = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < head; j++) {
				list.add(sc.nextInt());
			}
			lists.add(list);
		}
		if(lists.size()==1) {
			System.out.println(lists.get(0).size());
			return;
		}
		int cnt = 0;
		List<Integer> tmp = lists.get(0);
		for (int j = 0; j < tmp.size(); j++) {
			int check = tmp.get(j);
			boolean flag = false;
			for (int p = 0; p < lists.size(); p++) {
				if (lists.get(p) == tmp) {
					continue;
				} else {
					if (lists.get(p).contains(check)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
			}
			if (flag == true) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
