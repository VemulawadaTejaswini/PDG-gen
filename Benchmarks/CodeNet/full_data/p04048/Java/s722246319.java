import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
		
	}
	
	private static void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		long N = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		long X = Integer.parseInt(str.substring(str.indexOf(" ") + 1, str.length()));
		
		if (X < (double) N / 2) {
			
			double l = (double) (2 * (N - 2 * X) * Math.cos(60 * Math.PI / 180));
			
			if (X > l) {
				System.out.println((int) (N + 2 * X + (N - 2 * X) * (X / l * 2 - 1)));
			} else {
				System.out.println(N - X + (2 * (N / X - 1) - 1) * X);
			}
			
		} else if (N % 2 == 0 && X == N / 2) {
			System.out.println(3 * X);
		} else {
			System.out.println(4 * N - 3 * X);
		}
		
	}
}
