import java.util.Scanner;

public class Main {
	
	private static final long MOD = 1000000000 + 7;
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			long n = sc.nextLong();
			long k = sc.nextLong();
			
			//k = iの場合のmim, (0+1+2) max (n-2, n-1,n)の間に抜けはない？
			//k = n
			
			long combination = 0;
			for(long i = k; i <= n + 1; i++ ) {
				
				long start = 0;
				long end = 0;
				for(long j = 0 ; j < i ; j++ ) {
					start += j;
					end += n-j;
				}
				
				combination = (combination + (end - start + 1)) % MOD;
			}
			
			System.out.println(combination);
			
		}
	}


}