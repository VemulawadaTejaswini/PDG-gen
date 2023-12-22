import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n- 1];
		for (int i =0;i<a.length;i++) a[i] = sc.nextInt();
		int[] b = new int[n];
		for (int i=0;i<a.length;i++) {
			b[a[i] - 1]++;
		}

		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
