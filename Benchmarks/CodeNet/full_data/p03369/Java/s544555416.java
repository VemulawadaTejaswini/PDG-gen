import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			int ans =700;
			for(String t:chr) {
				if(t.equals("o")) {
					ans+=100;
				}
			}
			System.out.println(ans);

		}
	}
}