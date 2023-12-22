import java.math.BigInteger;
import java.util.*;
public class Main {
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		long s = sc.nextLong();
		
		for(int i = 0; i< n; i++) {
			if(i < k) {
				System.out.print(s);
			} else {
				System.out.print(s+1011);
			}
			
			if(i != n-1) {
				System.out.print(" ");
			}
			
		}
			
		
		

		


		
		
	}
	


}

 