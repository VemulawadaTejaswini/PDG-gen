import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int x = Integer.parseInt(chr[0]);
			int y = Integer.parseInt(chr[1]);
			int ans =x+y;
			System.out.println(ans<10 ? ans:"error" );
		}
	}
}
