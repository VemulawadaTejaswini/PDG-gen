import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		int k = scan.nextInt();
		Arrays.sort(a);
		for(int i = 0; i < k; i++) {
			a[2] = 2 * a[2];
		}
		System.out.println(a[0] + a[1] + a[2]);
	}
}