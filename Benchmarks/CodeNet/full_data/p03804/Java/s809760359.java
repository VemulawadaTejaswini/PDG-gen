import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		for (int i = 1; i <= n; i++) {
			String c;
			c = sc.next();
			for (int j = 1; j <= n; j++) {
				a[i][j] = c.charAt(0);
			}
		}
		for (int i = 1; i <= m; i++) {
			String c;
			c = sc.next();
			for (int j = 1; j <= m; j++) {
				b[i][j] = c.charAt(0);
			}
		}
		if (n < m) {
			System.out.println("No");
		} else {
			int y = 1;
			for (int i = 0; i <=  n-m; i++) {
				for (int j = 0; j<= n-m; j++){
					int x = 1;
					for (int k = 1; k <= m; k++) {
						for (int t = 1; t <= m; t++) {
							if (a[i+k][j+t] != b[k][t] ) {
								x = 0;
								break;
							}
						}
						if (x == 0) {
							break;
						}
					}
					if (x == 1) {
						System.out.println("Yes");
						y = 0;
					}
				}
				if (y == 0) {
					break;
				}
			}
			if (y == 1) {
				System.out.println("No");
			}
		}
	}
}
	