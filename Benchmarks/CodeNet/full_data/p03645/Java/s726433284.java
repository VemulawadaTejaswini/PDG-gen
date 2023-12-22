import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			if (arrA[i] == 1) {
				for (int j = 0; j < m; j++) {
					if (arrA[j] == arrB[i] && arrB[j] == n) {
						System.out.println("POSSIBLE");
						return;
					}
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
