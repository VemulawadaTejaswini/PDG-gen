import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n + 2];
		h[0] = 0;
		h[n + 1] = 0;

		for (int i = 1; i < n + 1; i++) {
			h[i] = sc.nextInt();
		}

		//p=-1なら谷、p=1なら山
		int[] p = new int[n + 2];
		p[0] = -1;
		p[n + 1] = -1;

		for (int i = 1; i < n + 1; i++) {
			if (h[i] > h[i - 1] && h[i] > h[i + 1]) {
				p[i] = 1;
			}
			if (h[i] < h[i - 1] && h[i] < h[i + 1]) {
				p[i] = -1;
			}
		}

		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			if (h[i] >= h[i - 1] && h[i] > h[i + 1]) {
				int left = i;
				int right = i;
				while (p[left] != -1) {
					left--;
				}
				while (p[right] != -1) {
					right++;
				}
				count += h[i] - Math.max(h[left], h[right]);
			}

			if (h[i] < h[i - 1] && h[i] < h[i + 1]) {
				int left = i - 1;
				int right = i + 1;
				while (p[left] != -1) {
					left--;
				}
				while (p[right] != -1) {
					right++;
				}
				if (h[i] - Math.max(h[left], h[right]) > 0) {
					count += h[i] - Math.max(h[left], h[right]);
				} else {
					count += h[i];
				}
			}
		}

		System.out.println(count);
		sc.close();
	}
}