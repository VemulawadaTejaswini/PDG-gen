import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long s = Long.parseLong(br.readLine());

		long x1 = 0;
		long y1 = 0;
		long x2 = 1000000000L;
		long y2 = 1;

		long x3 = 1000000000L - (s % 1000000000L);
		long y3 = (s + x2) / 1000000000L;

		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
	}
}
