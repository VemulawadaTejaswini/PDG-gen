import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {

		HashSet<Long> set = new HashSet<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		long a = Integer.parseInt(str[0]);
		long b = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		for (long i = a; i < a + k; i++) {
			set.add(i);
			System.out.println(i);
		}
		for (long i = b - k + 1; i <= b; i++) {
			if (!set.contains(i))
				System.out.println(i);
		}
	}
}