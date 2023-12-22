import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int[] charArray = readLine().chars().sorted().toArray();
		if (charArray[0] == charArray[1] && charArray[2] == charArray[3] && charArray[0] != charArray[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	private static String readLine() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
}
