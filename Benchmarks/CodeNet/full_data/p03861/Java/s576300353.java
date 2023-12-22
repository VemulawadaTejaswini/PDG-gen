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
		BigInteger count = num.get(0);
		BigInteger answer = BigInteger.ZERO;
		
		while(count.compareTo(num.get(1)) <= 0){

			if(count.remainder(num.get(2)).compareTo(BigInteger.ZERO) ==0) answer = answer.add(BigInteger.ONE);
			count = count.add(BigInteger.ONE);
		}		
		System.out.println(answer);
	}
}