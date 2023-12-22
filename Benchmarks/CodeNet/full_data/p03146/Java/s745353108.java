
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(n);
		int ans = 0;
		for (int i = 2;; i++) {
			if (n % 2 == 0) {
				n /= 2;
				if (list.contains(n)) {
					ans = i;
					break;
				}
				list.add(n);
			} else {
				n = 3 * n + 1;
				if (list.contains(n)) {
					ans = i;
					break;
				}
				list.add(n);
			}
		}
		
		System.out.println(ans);
	}
}
