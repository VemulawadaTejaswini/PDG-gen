import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		int[] answer = new int[n];

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				int direct = j - i;
				int shortCut = dist(i, x) + 1 + dist(j, y);
				int dist = Math.min(direct, shortCut);
				answer[dist]++;
			}
		}

		for (int i = 1; i < n; i++) {
			print(answer[i]);
		}

	}

	public static int dist(int p, int q) {
		return Math.max(q - p, p - q);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
