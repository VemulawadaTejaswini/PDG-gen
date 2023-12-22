import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		long[] a = new long[n + 1];
		long[] b = new long[n + 2];
		for (int i = 0; i < n; i++){
			if (s.charAt(i) == 'W')
				a[i + 1] = a[i] + 1;
			else
				a[i + 1] = a[i];
		}
		for (int i = n - 1; i >= 0; i--){
			if (s.charAt(i) == 'E')
				b[i + 1] = b[i + 2] + 1;
			else
				b[i + 1] = b[i + 2];
		}
		long ans = Long.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			ans = Math.min(ans, a[i] + b[i] - 1);
		}
		System.out.println(ans);
	}
}