import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");
		long s = Long.parseLong(num[0]);
		long c = Long.parseLong(num[1]);
		if (2 * s >= c)
			System.out.println((int) Math.floor(c / 2));
		else {
			long k = (long) Math.floor((c - 2 * s) / 4);
			System.out.println(s + k);
		}

	}
}
