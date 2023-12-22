import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	static int count = 0;
	
	public static int[] func(int[] ar) {
		Arrays.sort(ar);
		if (ar[0] == 0) {
			int[] result = {count, 0};
			return result;
		}
		//System.out.println(Arrays.toString(ar));
		count = count + ar[0] * 3 * (ar[1] / ar[0]);
		int[] next = {ar[0], (ar[1] % ar[0])};
		return func(next);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().trim().split(" ");
		int[] ar = Stream.of(line).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(ar);
		ar[0] = ar[0] - ar[1];
		//System.out.println(Arrays.toString(ar));
		System.out.println(func(ar)[0]);
	}
}