
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long a = 1;	
		
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				a = n/i;
			}
		}
		
		
		
		System.out.println((int)Math.log10(a)+1);
		
		
		

	}

}
