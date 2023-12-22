import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
		}
		int count = 0;
		int color = 10001;
		for (int i = 1; i < n; ++i) {
			if (a[i - 1] == a[i]) {
				++count;
				a[i] = color;
				++color;
			}
		}
		System.out.println(count);
		in.close();

	}

}