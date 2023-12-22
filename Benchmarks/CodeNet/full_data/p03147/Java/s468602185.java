import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int maxH = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			maxH = Math.max(maxH, h[i]);
		}
		
		int ans = 0;
		for (int i = 0; i < maxH; i++) {
			for (int j = 0; j < n; j++) {
				if (h[j] > 0) {
					h[j]--;
					if (j + 1 == n || h[j + 1] == 0) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
