import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		Collections.sort(list, Comparator.reverseOrder());
		System.out.println( list.get(0).multiply(list.get(1)).divide(list.get(0).gcd(list.get(1))) );
	}
}
