import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean judge = false;
		int beforeA = 0;
		int nextA = 0;
		for (int i = 1; i < n - 1; i++) {
			beforeA = a[i-1];
			nextA = a[i+1];
			if ( a[i] != (beforeA ^ nextA)) {
				judge = false;
				break;
			}
			judge = true;
		}

		System.out.println(judge ? "Yes" : "No");
		sc.close();
	}
}
