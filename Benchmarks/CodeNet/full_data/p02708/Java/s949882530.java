import java.util.Scanner;

public class Main {
	
	private static final long MOD = 1000000000 + 7;
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			long combination = 0;
			long start = 0;
			long end = 0;
			for(long i = 1; i <= n + 1; i++ ) {
				
				start += i-1;
				end += n+1-i;

//				System.out.println("##" + start + "," + end);
				if ( i >= k ) {				
					combination = add(combination,(end - start + 1));
				}
			}
			
			System.out.println(combination);
			
		}
	}

	public static long add(long a, long b) {
		long ans = a + b;
		
		if ( ans >= MOD ) {
			ans = ans % MOD;
		}
		
		return ans;
	}

}