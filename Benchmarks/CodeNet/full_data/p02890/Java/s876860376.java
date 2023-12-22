
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int num = list.get(0);
		int pos = 0;
		int[] change = new int[n];
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == num) {
				change[pos]++;
			} else {
				num = list.get(i);
				pos++;
				change[pos]++;
			}
		}
		list.clear();
		for(int i = 0; i < n; i++) {
			if(change[i] != 0) {
				list.add(change[i]);
			} else
				break;
		}
		Collections.sort(list);
		long[] ans = new long[n + 1];
		for(int i = n; i > 0; i--) {
			if(list.size() < i) {
				ans[i] = 0;
			} else if(list.size() == i) {
				ans[i] = list.get(0);
			} else {
				list.add(list.get(0) + list.get(1));
				list.remove(0);
				list.remove(0);
				Collections.sort(list);
				ans[i] = list.get(0);
			}
		}
		for(int i = 1; i < n + 1; i++) {
			System.out.println(ans[i]);
		}
	}

}
