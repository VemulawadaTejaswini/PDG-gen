import java.util.Scanner;
public class Main {
	static String[] c = {"a", "b", "c"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.next());
		int[] a = new int[100003];
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(sc.next());
			a[Math.max(0, b - 1)]++;
			a[b + 2]--;
		}
		int max = 0;
		for (int i = 1; i <= 100000; i++) {
			a[i] += a[i - 1];
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);
	}

}