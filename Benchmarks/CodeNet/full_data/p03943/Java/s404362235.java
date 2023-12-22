import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);

			int x=Math.max((Math.max(a, b)),c);
			int y=Math.min((Math.min(a, b)),c);
			System.out.println(x-y==a || x-y==b|| x-y==c?"YES":"NO");

		}
	}
}
