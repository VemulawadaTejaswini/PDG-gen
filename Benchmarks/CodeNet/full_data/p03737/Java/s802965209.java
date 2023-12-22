import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			String a = chr[0].substring(0,1);
			String b = chr[1].substring(0,1);
			String c = chr[2].substring(0,1);
			String ans =a+ b+ c;
			System.out.println(ans.toUpperCase());

		}
	}
}
