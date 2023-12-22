import java.util.*;


public class Main {

	static void log(long i) {
		System.out.println(i);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long pos = sc.nextLong();
		long numBlue = sc.nextLong();
		long numRed = sc.nextLong();
		
		long cntLoop = pos / (numBlue+numRed);
		long base = (numBlue+numRed)*cntLoop;
		long dif = pos - base;
		long cntLast;

		if (dif < numBlue)
			cntLast = dif;
		else
			cntLast = numBlue;
		dif = cntLoop*numBlue+cntLast;
		
		sc.close();
		log(dif);
	}

	// test 2 B - String Palindrome
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		long amount = sc.nextlong();
//
//		// 500
//		long c500=0;
//		c500 = amount/500;
//		
//		// 5
//		long c5 = (amount - (c500 * 500)) / 5;
//
//		// calc 螫峨＠縺?
//		log( c500 * 1000 + c5 * 5 );
//		
//		sc.close();
//	}
}
