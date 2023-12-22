import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int a[] = new int[n];
		for (int i = 0; i < str.length; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int count = 0;

		while (true) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					System.out.println(count);
					System.exit(0);
				} else {
					a[i] /= 2;
				}
			}
			count++;
		}
	}
}