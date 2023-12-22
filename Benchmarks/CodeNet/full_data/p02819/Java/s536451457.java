import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int x = Integer.parseInt(sc.next());
	        int num = 100003;
			boolean[] PrimeNumber =  new boolean[num+1];
			
			for (int i = 0 ; i < num +1 ; i++) {
				PrimeNumber[i] = false;
			}
			
			PrimeNumber[2] = true;			
			
	        boolean isPrime = false;

	        for (int i = 5; i <= num; i += 2) {

	        	for (int j = 2; j * j <= i; j++) {

	        		if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	                isPrime = true;
	            }
	            if (isPrime) {
	                PrimeNumber[i] = true;
	                
	            }
	        }
	        
	        
	        for (int i = x; i < num+1 ; i++ ) {
	        	if(PrimeNumber[i]) {
	        		System.out.println(i);
	        		break;
	        	}
	        	
	        }
	        
	    }

}