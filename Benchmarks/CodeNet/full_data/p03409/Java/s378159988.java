import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		for(int r = 0; r < n; r++) {
			c[r] = scanner.nextInt();
			d[r] = scanner.nextInt();
		}
		
		for(int l= 0; l < n; l++) {
			
			for(int k = 0; k < n; k++) {
				if (a[l] < c[k] && b[l] < d[k]) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
