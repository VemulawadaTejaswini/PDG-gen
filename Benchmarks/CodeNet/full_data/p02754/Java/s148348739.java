import java.util.*;


public class Main {

	static void log(int i) {
		System.out.println(i);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int pos = sc.nextInt();
		int numBlue = sc.nextInt();
		int numRed = sc.nextInt();
		int numBlueTook;

		boolean fDone = false;
		int ctr=0;
		
		int cntLoop = pos / (numBlue+numRed);
		int base = (numBlue+numRed)*cntLoop;
		int dif = pos - base;
		int cntLast;

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
//		int amount = sc.nextInt();
//
//		// 500
//		int c500=0;
//		c500 = amount/500;
//		
//		// 5
//		int c5 = (amount - (c500 * 500)) / 5;
//
//		// calc 螫峨＠縺?
//		log( c500 * 1000 + c5 * 5 );
//		
//		sc.close();
//	}
}
