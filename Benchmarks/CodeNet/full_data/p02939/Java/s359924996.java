
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		boolean passed = false;
		boolean afterpass = true;
		int count = 1;
		for(int i=1;i<n;i++) {
			if (!passed && !afterpass && (s.charAt(i-1) == s.charAt(i))) {
				afterpass = true;
			} else {
				count++;
				afterpass = passed;
				passed = false;
			}
		}
		
		if(!afterpass && n>1 && s.charAt(n-1) == s.charAt(n-2)) {
			count-=1;
		}
		
		System.out.println(count);
	}



}