import java.util.Scanner;

public class Main {

	static char[] line = new char[100000];
	static int n;
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		k = Integer.parseInt(sc.next());
		line = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (line[i] != line[i + 1])
				count++;
		}

		int ans = n - 1 - count + k * 2;
		System.out.println(Math.min(n - 1, ans));

	}
}