import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = sc.next();
		BigInteger k = sc.nextBigInteger();
		
		int sum = 0;
		int i = 0;
		for(; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				sum++;
			} else {
				break;
			}
		}
		
		if(k.compareTo(new BigInteger(sum+"")) == 0) {
			System.out.println("1");
			return;
		}
		
		System.out.println(s.charAt(i));
		
	}

}