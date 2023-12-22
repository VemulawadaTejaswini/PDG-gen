
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sc.next()) - 1;
		}
		int count = 0;
		int now = 0;
		while (true) {
			if (now == 1) {
				System.out.println(count);
				break;
			}
			if (count >= n) {
				System.out.println(-1);
				break;
			}
			count++;
			now = a[now];
		}
		sc.close();
	}
}