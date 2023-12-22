import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n;
	static ArrayList<ArrayList<Integer>> edge;
	static boolean used[];

	static boolean flag = false;
	static int ans;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int a[] = new int[n];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);

		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			min = Math.min(a[i], min);

			if (min < a[i]) {

			} else {
				ans++;
			}
		}

		System.out.println(ans);
	}
}