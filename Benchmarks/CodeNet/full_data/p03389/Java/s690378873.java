import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int cnt = a[2] - a[1];
		a[1] += cnt;
		a[0] += cnt;
		int tmp = a[2] - a[0];
		if (tmp % 2 == 1) {
			tmp = tmp / 2 + 1;
			cnt += tmp + 1;
		} else {
			tmp = tmp / 2;
			cnt += tmp;
		}
		System.out.println(cnt);
	}
}