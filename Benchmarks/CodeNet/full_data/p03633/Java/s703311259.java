import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BigInteger> list = new ArrayList<>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			list.add( new BigInteger(sc.next()) );
		}
		List<BigInteger> newList = new ArrayList<>(new HashSet(list));

		BigInteger result = LCM(newList.get(0), newList.get(1));
		for(int i = 2; i < newList.size(); i++) {
			result = LCM(result, newList.get(i));
		}
		System.out.println(result);
	}

	private static BigInteger LCM(BigInteger a, BigInteger b) {
		return a.multiply(b).divide(a.gcd(b));
	}
}
