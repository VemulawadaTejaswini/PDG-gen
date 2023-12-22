
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
					list.add(a[j]);
				}
			}
			int j = 2;
			for(j = 2; j < n; j++) {
				long tmp = circle[j - 2] ^ circle[j - 1];
				if(list.contains(tmp)) {
					circle[j] = tmp;
					list.remove(tmp);
				} else {
					break;
				}
			}
			if(j == n && circle[0] == (circle[n - 2] ^ circle[n - 1])) {
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
