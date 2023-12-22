import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		double dif = Integer.MAX_VALUE, ave = 0;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			ave += a[i];
		}
		ave = ave / n;
		for (int i = 0; i < n; i++) {
			if (dif > Math.abs(ave - a[i])) {
				dif = Math.abs(ave - a[i]);
				idx = i;
			}
		}
		System.out.println(idx);
	}
}
