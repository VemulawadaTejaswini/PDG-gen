
import java.util.Scanner;



public class Main {


	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		long k = sc.nextLong();
		
		if (k%2==0) {
			System.out.println(calc(s+s)+(k-2)/2*(calc(s+s+s+s)-calc(s+s)));
		} else {
			System.out.println(calc(s)+(k-1)/2*(calc(s+s+s)-calc(s)));
		}
		
	}
	
	public static long calc (String s) {
		int n = s.length();
		int count = 0;
		boolean change = false;
		for (int i=0;i<n-1;i++) {
			if (change) {
				change=false;
			}else if (s.charAt(i)==s.charAt(i+1)) {
				count++;
				change=true;
			}
		}
		return count;
	}



}