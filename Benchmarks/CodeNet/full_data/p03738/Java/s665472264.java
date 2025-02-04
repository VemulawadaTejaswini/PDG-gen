import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			BigInteger bi1 = new BigInteger(sc.next());
			BigInteger bi2 = new BigInteger(sc.next());
			String ans = "EQUAL";
			if(bi1.compareTo(bi2) > 0) {
				ans = "GREATER";
			}else if(bi1.compareTo(bi2) < 0) {
				ans = "LESS";
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
