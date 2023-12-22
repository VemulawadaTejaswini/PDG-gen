import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N + 1];
		array = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int result = array[0];

		for (int i = 1; i < N - 1; i++) {
			result += Math.min(array[i], array[i - 1]);
		}

		System.out.println(result);
	}

}
