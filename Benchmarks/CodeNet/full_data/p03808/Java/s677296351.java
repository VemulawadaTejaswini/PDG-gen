import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			if (max < a) {
				max = a;
				maxIdx = i;
			}
		}
		while (max != 0) {
			max = 0;
			int maxIdxtmp = 0;
			for (int i = 1; i <= n; i++) {
				int a = arr[(maxIdx + i) % n];
				a -= i;
				if (a < 0) {
					System.out.println("NO");
					return;
				}
				if (max < a) {
					max = a;
					maxIdxtmp = (maxIdx + i) % n;
				}
				arr[(maxIdx + i) % n] = a;
			}
			maxIdx = maxIdxtmp;
		}
		System.out.println("YES");
	}
}
