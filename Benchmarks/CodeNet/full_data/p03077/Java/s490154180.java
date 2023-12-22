import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		BigDecimal[] S = new BigDecimal[5];
		BigDecimal N = sc.nextBigDecimal();
		S[0] = sc.nextBigDecimal();

		Arrays.sort(S);

		BigDecimal a = N.divide(S[0]);
		BigDecimal b = a.setScale(0, BigDecimal.ROUND_HALF_UP);

		System.out.println(b.add(new BigDecimal(4)));
	}
}