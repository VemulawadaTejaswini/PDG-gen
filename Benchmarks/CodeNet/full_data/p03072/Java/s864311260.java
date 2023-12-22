import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, ans;
		List<Integer> heights = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			heights.add(scanner.nextInt()); 
		}
		scanner.close();
		
		int nW, nS = 0;
		boolean higher = true;
		ans = 1;
		
		for (int j = n - 1; 1 <= j; j--) {
			nS = heights.get(j);
			
			for (int k = 0; k <= j -1; k++) {
				if (higher) {
					nW = heights.get(k);
					if (nW > nS) {
						higher = false;
					}
				}
			}
			if (higher) {
				ans++;
			}
			higher = true;
		}
		System.out.println(ans);
		
	}
}
