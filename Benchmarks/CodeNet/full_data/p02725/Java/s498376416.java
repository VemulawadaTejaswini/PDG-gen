import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		int count = a[2] - a[0];
		if (a[1] + a[2] - 2 * a[0] < count) {
			count = a[1] + a[2] - 2 * a[0];
		}
		if (2 * a[2] - a[1] - a[0] < count) {
			count = 2 * a[2] - a[1] - a[0];
		}
		System.out.println(count);
		kb.close();
	}

}
