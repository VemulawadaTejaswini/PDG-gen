import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] result = new int[n];
		result[1] = n;
		
		for (int i = 1; i < n; i++) {
			int first = x - i;
			int second = y - x;
			int third = n - y;

			for (int k = 2; i + k <= n; k++) {
				if (first < 0 && k <= n - i) {
					result[k]++;
					continue;
				}
				
				if (k <= first) {
					result[k]++;
					continue;
				}
				
				int nokori = k - first;
				//X → Y → 大きい値の場合
				if ((nokori > 1) && (nokori - 1 <= third)) {
					result[k]++;
				}
				
				double middle = (y + 1 - x) / 2.0;
				if (nokori < middle) {
					result[k] += 2;
				} else if (nokori == middle) {
					result[k]++;
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}