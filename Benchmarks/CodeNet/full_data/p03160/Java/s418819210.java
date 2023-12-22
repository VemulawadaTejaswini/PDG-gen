import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[] arr;
	static int[] memo;
	static boolean f = false;
	static boolean t = false;
	static int OO = (int) 1e9 + 7;

	static int dp(int i) {
		if (i == n - 1)
			return 0;
		
		if (memo[i] != -1)
			return memo[i];

		int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
		if (i < n - 1)
			a = Math.abs(arr[i + 1] - arr[i])+dp(i + 1);
		if (i < n - 2)
			b =  Math.abs(arr[i + 2] - arr[i])+dp(i + 2);
		
		return memo[i] = Math.min(a, b);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		memo = new int[n + 1];
		Arrays.fill(memo, -1);
		pw.print(dp(0));
		pw.close();
	}
}
