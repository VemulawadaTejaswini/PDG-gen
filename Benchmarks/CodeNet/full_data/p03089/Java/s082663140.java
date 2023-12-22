import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i < n ;i ++) {
			a[i] = sc.nextInt();
		}
		
		
		int[] ans = new int[n];
		for(int i = 0 ; i < n ; i++) {
			
			int large = 0;
			for(int j = n-1; j >= 0; j--) {
				if(a[j] == 0) {
					large++;
					continue;
				}
				
				if(a[j] == i - large + 1) {
					ans[i] = a[j];
					a[j] = 0;
					break;
				}
			}
			
			if(ans[i] == 0) {
				System.out.println(-1);
				return;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
		
	}
}