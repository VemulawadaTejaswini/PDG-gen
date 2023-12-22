import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int h1 = Integer.parseInt(chr[0]);
			int w1 = Integer.parseInt(chr[1]);
			String inp = br.readLine();
			String chrp[] = inp.split(" ");
			int h = Integer.parseInt(chrp[0]);
			int w = Integer.parseInt(chrp[1]);

			 System.out.println((h1-h)*(w1-w));
		}
	}
}