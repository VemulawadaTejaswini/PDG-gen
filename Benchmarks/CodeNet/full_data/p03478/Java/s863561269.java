import java.util.*;

public class Main {
	
	public static int sumDigit( int num ) {
		
		int sum = 0;
		int n = num;
		
		while ( n > 0 ) {
			sum += n % 10;
			n = n / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int sumnum = 0;
		
		for (int i = 1; i < N + 1; i++) {
			
			if ( A <= sumDigit(i) && sumDigit(i) <= B ) {
				sumnum += i;
			}
			
		}
		System.out.println(sumnum);

	}

}