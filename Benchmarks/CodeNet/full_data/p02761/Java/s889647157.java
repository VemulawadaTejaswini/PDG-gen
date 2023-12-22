import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] ansArr = new int[n];
		Arrays.fill(ansArr, -1);
		
		int m = sc.nextInt();
		for(int i = 0 ; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			
			if(s == 1 && c == 0) {
				System.out.println(-1);
				return;
			}
			if(ansArr[s-1] >= 0 && ansArr[s-1] != c) {
				System.out.println(-1);
				return;
			}
			ansArr[s-1] = c;
		}
		
		for(int i = 0; i < n ; i++) {
			if(ansArr[i] < 0) {
				if(i == 0) {
					System.out.println(1);
				}else {
					System.out.print(0);
				}
			}else {
				System.out.print(ansArr[i]);
			}
		}
		
		System.out.print("\n");
		
		sc.close();
	}
}
