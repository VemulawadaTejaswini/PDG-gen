import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = new int[100010];
		int[] d = new int[100010];
		for (int i = 1;i <= n;i++) {
			x[i] = sc.nextInt();
			if (i!=1) d[i] = x[i]-x[i-1];
		}
		long ret = 0;
		for (int i = 2;i <= n;i++) {
			long t = d[i]*a;
			if (t<b) {
				ret += t;
			} else {
				ret += b;
			}
		}
		System.out.println(ret);
	}
}
