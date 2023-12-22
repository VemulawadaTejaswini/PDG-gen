import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = new int[100010];
		for (int i = 0; i < n; i++) {
			b[a[i]]++;
		}
		for (int i = 0; i < 100005; i++) {
			int c = b[i]+b[i+1]+b[1+2];
			if (c >= max) {
				max = c;
			}
		}
		System.out.println(max);
	}
}
