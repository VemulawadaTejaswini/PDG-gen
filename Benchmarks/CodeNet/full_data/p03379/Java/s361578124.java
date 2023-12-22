
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		long[] ans = new long[n];
		for(int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			list.add(tmp);
			ans[i] = tmp;
		}
		Collections.sort(list);
		long a1 = list.get(n / 2);
		long a2 = list.get(n / 2 - 1);
		for(int i = 0; i < n; i++) {
			if(ans[i] < a1) {
				System.out.println(a1);
			} else {
				System.out.println(a2);
			}
		}
	}

}
