import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			c[a[i] - 1] = b[i];
		}
		for (int i = 0; i < n; i++) {	
			System.out.print(c[i] + " ");
		}
	}
}