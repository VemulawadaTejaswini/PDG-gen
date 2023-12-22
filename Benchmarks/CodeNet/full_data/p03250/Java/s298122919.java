mport java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		sc.close();

		Arrays.parallelSort(a);
		System.out.println(a[0] + a[1] + a[2] * 10);
	}
}
