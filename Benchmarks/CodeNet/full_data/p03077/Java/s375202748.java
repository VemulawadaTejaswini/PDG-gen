import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		Long a[] = new Long[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long btl = a[0];

		long r = N/btl;

		System.out.println(r+5);

	}
}
