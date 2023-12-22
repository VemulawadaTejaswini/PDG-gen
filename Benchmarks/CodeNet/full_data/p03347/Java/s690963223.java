import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		boolean flg = false;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		if (a[0] != 0) flg = true;
		for(int r = n - 1; r > 0; r--) {
			if(a[r] - a[r-1] > 1) {
				flg = true;
				break;
			}
			if(a[r] != 0) {
				if(a[r] <= a[r-1]) {
					ans += a[r];
				}else {
					ans++;
				}
			}
			
		}
		if(flg) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}