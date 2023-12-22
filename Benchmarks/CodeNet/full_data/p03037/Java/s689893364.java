import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans;
		int[] key = new int[n];
		for(int i = 1; i <=n; i++) {
			key[i-1] = i;
		}
		int maxL = 0;
		int minR = n;
		for(int i = 0; i < m; i++) {
			maxL = Math.max(maxL, sc.nextInt());
			minR = Math.min(minR, sc.nextInt());
		}
		ans = minR-maxL+1;
		System.out.println(Math.max(ans, 0));
	}
}