import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ab[][] = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}
		Arrays.sort(ab, (a, b) -> Double.compare(a[0], b[0]));
//		System.out.println(Arrays.deepToString(ab));
				
		int mark = 999999;
		int max = 0;
		long ans = 0;
		for (int i = 1; i <= m; i++) {
//			System.out.println(i);
			for (int j = 0; j < n; j++) {
				if (ab[j][0] <= i) {
					max = Math.max(max, ab[j][1]);
					if (max == ab[j][1]) {
						mark = j;
					}
//					System.out.println(max);
				}
				else if (mark == 999999) {
					continue;
				}
				else {
					ans += max;
//					System.out.println(ans);
					max = 0;
					ab[mark][0] = 1000000;
					mark = 999999;
					Arrays.sort(ab, (a, b) -> Double.compare(a[0], b[0]));
//					System.out.println(Arrays.deepToString(ab));
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}