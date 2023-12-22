import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	static int count = 0;
	
	public static int[] func(int[] ar) {
		//System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		if (ar[0] == 0) {
			//int[] result = {count, 0};
			//return result;
			return ar;
		}
		//System.out.println(Arrays.toString(ar));
		//count = count + ar[0] * 3 * (ar[1] / ar[0]);
		int[] next = {ar[0], (ar[1] % ar[0])};
		return func(next);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().trim().split(" ");
		int[] ar = Stream.of(line).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(ar);
		ar[1] = ar[1] - ar[0];
		//System.out.println(Arrays.toString(ar));
		//int[] ar = {3, 2};
		//System.out.println(func(ar)[0]);
		int poi = func(ar[1]);
		int result = poi * 3 * ((ar[0] * ar[1]) / poi);
		System.out.println(result);
	}
}