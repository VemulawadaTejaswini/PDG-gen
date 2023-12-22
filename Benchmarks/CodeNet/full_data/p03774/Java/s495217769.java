import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n + 1];
		int b[] = new int[n + 1];
		int goTo[] = new int[n + 1];
		int c[] = new int[m + 1];
		int d[] = new int[m + 1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 1; i <= m; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		int min;
		for(int i = 1; i <= n; i++) {
			min = length(a[i], b[i], c[1], d[1]);
			goTo[i] = 1;
			for(int j = 2; j <= n; j++) {
				if(min > length(a[i], b[i], c[j], d[j])) {
					min = length(a[i], b[i], c[j], d[j]);
					goTo[i] = j;
				}
			}
		}
		for(int i = 1; i <= n; i++) System.out.println(goTo[i]);

	}
	
	static int length(int a, int b, int c, int d) {
		int result = Math.abs(a - c) + Math.abs(b - d);
		return result;
	}
	
}
