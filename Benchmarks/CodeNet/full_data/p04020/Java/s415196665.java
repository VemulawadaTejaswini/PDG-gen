import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(in.readLine());
		int[] arr = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		out.println(Solve(arr));
		out.close();
		in.close();
	}

	private static int Solve(int[] arr) {
		int r = 0, mod = 0;
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			r += arr[i] / 2;
			 mod = arr[i] % 2;
		}
//		System.out.println(r + " " + mod);
		return r;
	}

}
