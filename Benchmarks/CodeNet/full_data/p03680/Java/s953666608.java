import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean[] buttons = new boolean[n];
		int count = 0;
		int next = 1;
		while (true) {
			if (buttons[next - 1]) {
				break;
			}
			if (next == 2) {
				System.out.println(count);
				return;
			}
			buttons[next - 1] = true;
			next = arr[next - 1];
			count++;
		}
		System.out.println(-1);
	}
}
