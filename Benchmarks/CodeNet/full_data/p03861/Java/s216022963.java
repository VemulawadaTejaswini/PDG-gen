import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> num = new ArrayList<BigInteger>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextBigInteger()) {
				num.add(sc.nextBigInteger());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<BigInteger> num, ArrayList<String> param) {

		System.out.println(num.get(1).divide(num.get(2)).subtract((num.get(0).subtract(BigInteger.ONE)).divide(num.get(2))));
	}
}