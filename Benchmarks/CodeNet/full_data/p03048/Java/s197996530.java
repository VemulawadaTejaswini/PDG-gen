import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rgb = new int[3];
		rgb[0] = sc.nextInt();
		rgb[1] = sc.nextInt();
		rgb[2] = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		Arrays.sort(rgb);
		int rgb0 = N / rgb[0];
		int rgb1 = N / rgb[1];
		int rgb2 = N / rgb[2];

		int ans = 0;
		for (int i = 0; i <= rgb2; i++) {
			for (int j = 0; j <= rgb1; j++) {
				for (int k = 0; k <= rgb0; k++) {
					int diff = N;
					if (i != 0) {
						diff -= rgb[2] * i;
						if (diff == 0) {
							ans++;
							break;
						}
						if (diff < 0) {
							break;
						}
					}
					if (j != 0) {
						diff -= rgb[1] * j;
						if (diff == 0) {
							ans++;
							break;
						}
						if (diff < 0) {
							break;
						}
					}
					if (k != 0) {
						diff -= rgb[0] * k;
						if (diff == 0) {
							ans++;
							break;
						}
						if (diff < 0) {
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
