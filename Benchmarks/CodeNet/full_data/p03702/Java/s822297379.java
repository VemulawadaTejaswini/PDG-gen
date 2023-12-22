import java.util.*;

public class Main{ // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] health = new int[n];
		for(int i = 0; i < n; i ++) {
			health[i] = scanner.nextInt();
		}
		int min = 1;
		int max = (int) Math.pow(10, 9);
		int ans = 0;
		while(min < max) {
			int med = (min + max) / 2;
			int count = 0;
			for(int i = 0; i < n; i ++) {
				int k = (health[i] - med * b + a - b - 1) / (a - b);
				k = Math.max(0, k);
				count += k;
			}
			if(count <= med) {
				ans = med;
				max = med;
			} else {
				min = med + 1;
			}
		}
		System.out.println(ans);
				
		scanner.close();
	}
}