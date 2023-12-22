import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.next();
		}
		boolean flag = false;
		for(int i = 0; i <= n - m; i++) {
			for(int j = 0; j< n - m; j++) {
				outside: for(int k = 0; k < m; k++) {
					for(int l = 0; l < m; l++) {
						if(a[i + k].charAt(j + l) != b[k].charAt(l)) {
							flag = false;
							break outside;
						}
						flag = true;
					}
				}
			if(flag == true) {
				System.out.println("Yes");
				return;
			}
			}
		}
		System.out.println("No");
	}
}