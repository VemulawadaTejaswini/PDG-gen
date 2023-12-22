import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), check, cnt = 1;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		check = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] != check) {
				cnt++;
			}
			check = a[i];
		}

		System.out.println(cnt);
	}

}