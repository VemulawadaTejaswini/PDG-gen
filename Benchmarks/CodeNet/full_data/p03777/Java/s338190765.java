import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");

			System.out.println(chr[0].equals("H")?chr[1]
							   :chr[0].equals("D")&&chr[1].equals("D")?"H"
							   :"D");

		}
	}
}
