import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		while (true) {
			boolean containOdd = false;
			for (int i = 0; i < a.length; i++) {
				int tmp = a[i];
				if (tmp % 2 == 0) {
					a[i] = tmp / 2;
				} else {
					containOdd = true;
					break;
				}
			}
			if (containOdd)
				break;
			else
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}