import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public boolean isQube(Integer number) {
		for(int i=0;i<100100;i++) {
			if (i*i==number) return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main product = new Main();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String inputLine = reader.readLine();
			String numbers[] = inputLine.split(" ");
			System.out.println(product.isQube(Integer.valueOf(numbers[0] + numbers[1])) ? "Yes" : "No");
		} catch (IOException ignore) {
		}
	}
}
