import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int alice = 0;
		int bob = 0;

//		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += a[i];
			}
			if (i % 2 == 1) {
				bob += a[i];
			}
		}
		if (alice >= bob) {
			System.out.println(alice - bob);
		} else {
			System.out.println(bob - alice);
		}
	}

}
