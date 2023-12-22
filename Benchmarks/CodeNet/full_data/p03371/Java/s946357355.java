import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int x = Integer.parseInt(str[3]);
		int y = Integer.parseInt(str[4]);

		int ab = a * x + b * y;

		int min = 0;
		int max = 0;
		int than = 0;

		if (x > y) {
			min = 2 * y;
			max = 2 * x;
			than = a * (x - y);
		} else {
			min = 2 * x;
			max = 2 * y;
			than = b * (y - x);
		}

		int z = c * min + than;
		int zz = c * max;

		if (ab > z) {
			System.out.println(Math.min(z, zz));
		} else {
			System.out.println(Math.min(ab, zz));
		}
	}
}