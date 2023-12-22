import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		if (line.equals("A")) {
			System.out.println("T");
		}
		else if (line.equals("T")) {
			System.out.println("A");
		}
		else if (line.equals("C")) {
			System.out.println("G");
		}
		else if (line.equals("G")) {
			System.out.println("C");
		}
	}
}