import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int happychild = 0;

		for (int i = 0; i < a.length; i++) {

			int rem =  x - a[i];

			if(rem < 0) {
				break;
			}
			happychild++;
		}
		System.out.println(happychild);
	}

}
