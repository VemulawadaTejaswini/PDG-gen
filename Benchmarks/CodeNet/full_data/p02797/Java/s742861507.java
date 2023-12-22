import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		if (k == 0) {
			List<String> list = new ArrayList<>();
			String string = String.valueOf(s - 1);
			for (int i = 0; i < n; i++) {
				list.add(string);
			}
			System.out.println(String.join(" ", list));
		} else if (k <= n) {
			List<String> list = new ArrayList<>();
			String just = String.valueOf(s);
			for (int i = 0; i < k; i++) {
				list.add(just);
			}
			String string = String.valueOf(1000000001);
			for (int i = 0; i < n - k; i++) {
				list.add(string);
			}
			System.out.println(String.join(" ", list));
		}
	}
}
