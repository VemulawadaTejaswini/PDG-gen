
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		List<List<Long>> loop = new ArrayList<>();
		long[] a = new long[n];
		List<Long> list = new ArrayList<>();
		loop.add(new ArrayList<>());
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if(list.contains(a[i])) {
				list = list.subList(0, list.indexOf(a[i]));
			} else {
				list.add(a[i]);
			}
		}
		while(!list.isEmpty()) {
			List<Long> tmp = new ArrayList<>(list);
			loop.add(tmp);
			for(int i = 0; i < n; i++) {
				if(list.contains(a[i])) {
					list = list.subList(0, list.indexOf(a[i]));
				} else {
					list.add(a[i]);
				}
			}
		}
		List<Long> ans = new ArrayList<>(loop.get((int) k % loop.size()));
		for(Long e : ans) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
