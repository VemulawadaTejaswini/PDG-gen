import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Grand Contest 036
//A	Triangle
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal S = new BigDecimal(sc.next());
		sc.close();

		if (S.precision() < 10) {
			System.out.println("0 0 0 1 " + S.toPlainString() + " 0");
		} else {
			// 上限値+1のint型配列を宣言
			int max = 99999;
			int[] count = new int[max + 1];
			for (int i = 0; i <= max; ++i) count[i] = 0;
			for (int i = 2; i <= max; ++i) {
				int pos = i;
				while (pos <= max) {
					++count[pos];
					pos += i;
				}
			}
			List<Integer> primes = new ArrayList<>();
			for (int i = 2; i <= max; ++i) {
				if (count[i] == 1) {
					primes.add(i);
				}
			}

			long x = 1;
			int i = 0;
			while (S.precision() >= 10) {
				for (; i < primes.size(); i++) {
					int mod = primes.get(i);
					if (S.remainder(BigDecimal.valueOf(mod)).equals(BigDecimal.ZERO)) {
						x *= mod;
						S = S.divide(BigDecimal.valueOf(mod));
						break;
					}
				}
				if (i == primes.size()) {
					break;
				}
			}
			System.out.println("0 0 0 " + x + " " + S.toPlainString() + " 0");
		}
	}
}
