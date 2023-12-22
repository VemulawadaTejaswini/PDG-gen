import java.util.*;


public class Main {

	// test 2 B - String Palindrome
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int amount = sc.nextInt();

		// 500
		int c500=0;
		c500 = amount/500;
		
		// 5
		int c5 = (amount - (c500 * 500)) / 5;

		// calc 嬉しさ
		log( c500 * 1000 + c5 * 5 );
		
		sc.close();
	}

	static void log(int i) {
		System.out.println(i);
	}
	
}
