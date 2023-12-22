import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;
	public static int[] array;

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(f.readLine());
		}
		for (int i : array) {
			M -= i;
		}
		Arrays.sort(array);
		int res = array.length;
		res += (M / array[0]);
		System.out.println(res);
	}
}