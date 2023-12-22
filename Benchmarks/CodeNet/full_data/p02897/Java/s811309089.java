import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();

			BigDecimal n = new BigDecimal(in);
			BigDecimal d = new BigDecimal("2");

			BigDecimal div = n.divide(d, 0, BigDecimal.ROUND_HALF_UP);
			System.out.println(div.divide(n,10, BigDecimal.ROUND_HALF_UP));
		}
	}
}