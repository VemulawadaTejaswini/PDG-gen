import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[] = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
			for(int k = 0; k < n; k++) {
//				if(k == r) {
//					if(k == 0) {
//						ans -= Math.abs(a[k]) + Math.abs(a[k+1]-a[k]) - Math.abs(a[k+1]);
//					}else if(k == n-1) {
//						ans -= Math.abs(a[k]-a[k-1]) + Math.abs(-a[k]) - Math.abs(-a[k-1]);
//					}else {
//						ans -= Math.abs(a[k]-a[k-1]) + Math.abs(a[k+1]-a[k]) - Math.abs(a[k+1]-a[k-1]);			
			 if(k == 0) {
					ans += Math.abs(-a[k]);
				}else if(k == n-1) {
					ans += Math.abs(a[k] - a[k-1]);
					ans += Math.abs(a[k]);
				}else {
					ans += Math.abs(a[k] - a[k-1]);
				}
			}
			for(int r = 0; r < n; r++) {
				int aans = ans;
				if(r == 0) {
					aans -= Math.abs(a[r]) + Math.abs(a[r+1]-a[r]) - Math.abs(a[r+1]);
				}else if(r == n-1) {
					aans -= Math.abs(a[r]-a[r-1]) + Math.abs(-a[r]) - Math.abs(-a[r-1]);
				}else {
					aans -= Math.abs(a[r]-a[r-1]) + Math.abs(a[r+1]-a[r]) - Math.abs(a[r+1]-a[r-1]);
				}
				System.out.println(aans);
			}
	}
}
