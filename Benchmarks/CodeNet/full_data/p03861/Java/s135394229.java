import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {
		
		
		
		long A = cin.nextLong();
	
		long end = cin.nextLong();
		
		long X = cin.nextLong();
		
		long r = A % X;
		long start = A + (r == 0? 0: X - r);
		
		
		long res = 0;
		long sum = X;
		long mult = 1;
		
		if (start <= end) {
			res = 1;
		}
		
		
		while (start <= end) {
			
			if (start + sum <= end) {
				start += sum;				
				res   += mult;
				
				sum  += sum;
				mult += mult;
			} else {
				sum = X;
				mult = 1;
				
				if (start + sum > end) {
					break;
				}
				
				start += sum;
				res   += mult;
				
			}
			
		}
		
		
		
		System.out.println(res);
	}
	
	 
}

