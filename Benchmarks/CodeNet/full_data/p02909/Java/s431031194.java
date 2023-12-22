import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		if (line.equals("Sunny")) {
			System.out.println("Cloudy");
		}
		else if (line.equals("Cloudy")) {
			System.out.println("Rainy");
		}
		else if (line.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}
}
