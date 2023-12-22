import java.util.*;

public class Main {

	// test 2 B - String Palindrome
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int lenInput = input.length();
		
		String str1 = input.substring(0,(lenInput-1)/2);
		String str2 = input.substring((lenInput+1)/2, lenInput);

		log( str1.equals(str2) ? "yes" : "no"); 
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}
}
