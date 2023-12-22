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
		int r = 0, mod[] = new int[arr.length];
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				mod[i] = (i + 1);
			r += arr[i] / 2;
		}
		Arrays.sort(mod);
		for (int i = 0; i < mod.length-1; i ++)
			if (Math.abs(arr[arr.length - 1 - i] - arr[arr.length - 2 - i]) <= 0)
				r++;
//		System.out.println(Arrays.toString(arr) + "\t\t" + Arrays.toString(mod));
		return r;
	}

}
