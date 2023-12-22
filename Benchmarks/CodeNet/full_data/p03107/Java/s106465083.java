
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		
		//11011010001011
		//1 8
		//0 6

		//System.out.println(count(S)*2);
		int c0=0;
		int c1=0;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i)=='0') {
				c0++;
			} else {
				c1++;
			}
		}
		System.out.println(S.length()-(Math.abs(c0-c1)));

		
		
	}
	public static int count(String S) {
		int c=0;
		String T="";

		for(int i=0; i<S.length()-1; i++) {
			if(S.charAt(i+1) != S.charAt(i)) {
				c++;
				i++;
				if(i==S.length()-2) {
					T=T+S.charAt(i+1);
				}
			} else {
				T=T+S.charAt(i+1);
				if(i+1==S.length()) {
					T=T+S.charAt(i);
				}
			}
		}
		if(c==0) {
			return 0;
		}
		c+=count(T);
		return c;
		
	}

}
