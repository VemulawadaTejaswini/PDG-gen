import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrD = new int[n];
		for (int i = 0; i < n; i++) {
			arrD[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arrT = new int[m];
		for (int i = 0; i < m; i++) {
			arrT[i] = sc.nextInt();
		}
		Arrays.sort(arrD);
		Arrays.sort(arrT);
		int idx = 0;
		for (int i = 0; i < m; i++) {
			while (true) {
				if (idx >= n || arrD[idx] > arrT[i]) {
					System.out.println("NO");
					return;
				} else if (arrD[idx] == arrT[i]) {
					idx++;
					break;
				} else {
					idx++;
				}
			}
		}
		System.out.println("YES");
	}
}
