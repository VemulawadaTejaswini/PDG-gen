import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String S;
		S = sc.next();
		
		BigInteger the_number = BigInteger.valueOf(2019);
		BigInteger canditate;
		
		int answer = 0;
		for (int i = 0; i < S.length(); ++i) {
			for (int j = i+2; j <= S.length(); ++j) {
				canditate = new BigInteger(S.substring(i, j));
				if(canditate.mod(the_number).equals(BigInteger.ZERO)) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}

}
