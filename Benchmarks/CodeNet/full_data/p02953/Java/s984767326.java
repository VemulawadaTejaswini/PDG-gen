import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] h = new long[N];
		h[0] = sc.nextLong();
		for (int i = 1; i < h.length; i++) {
			h[i] = sc.nextLong();
			if (h[i - 1] > h[i])
				h[i - 1]--;
			else if ((h[i] - h[i - 1]) >= 1)
				h[i]--;
		}
		sc.close();
		for (int i = 0; i < h.length - 1; i++) {
			if (h[i] > h[i + 1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}