
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		List<Long> set = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			set.add(sc.nextLong());
		}
		boolean ans = false;
		for(Long e : set) {
			a[0] = e;
			List<Long> tmp = new ArrayList<>(set);
			tmp.remove(a[0]);
			for(Long f : set) {
				a[1] = f;
				int i = 2;
				List<Long> tmp2 = new ArrayList<>(tmp);
				tmp2.remove(a[1]);
				while(i < n) {
					long val = a[i - 2] ^ a[i - 1];
					if(tmp2.contains(val)) {
						a[i] = val;
						i++;
						tmp2.remove(val);
					} else {
						break;
					}
				}
				if(i == n && a[0] == (a[n - 2] ^ a[n - 1])) {
					ans = true;
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
