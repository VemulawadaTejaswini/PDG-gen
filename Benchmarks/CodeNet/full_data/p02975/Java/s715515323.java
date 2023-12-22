
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] circle = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		boolean ans = false;
		circle[0] = a[0];
		for(int i = 1; i < n; i++) {
			circle[1] = a[i];
			List<Long> list = new ArrayList<>();
			for(int j = 1; j < n; j++) {
				if(i != j) {
					list.add(a[i]);
				}
			}
			int j = 2;
			for(j = 2; j < n; j++) {
				long tmp = a[j - 2] ^ a[j - 1];
				if(list.contains(tmp)) {
					a[j] = tmp;
					list.remove(tmp);
				} else {
					break;
				}
			}
			if(j == n) {
				ans = true;
				break;
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
