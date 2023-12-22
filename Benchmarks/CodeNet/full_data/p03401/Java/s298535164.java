import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		int befPlace = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += Math.abs(a[i] - befPlace);
			befPlace = a[i];
		}
		sum += Math.abs(0 - befPlace);

		int diff = 0;
		int befPlace2 = 0;
		int nextPlace = 0;
		for (int i = 0; i < n; i++) {
			nextPlace = (i == n - 1) ? 0 : a[i + 1];
			int shortCut = Math.abs(befPlace2 - nextPlace);
			int normal = Math.abs(befPlace2 - a[i]) + Math.abs(a[i] - nextPlace);
			diff = normal - shortCut;
			System.out.println(sum - diff);
			befPlace2 = a[i];
		}
	}

}
