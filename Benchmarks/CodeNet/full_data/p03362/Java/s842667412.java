import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int k = in.nextInt();
		int[] primes = new int[k];
		int item = 0;
		String numString = "";
		for ( int i = 3; i < 55555; i++ ) {
			if (item == k)
				break;
			numString = Integer.toString(i);
			if (isPrime(i) && numString.charAt(numString.length()-1) == '1' ) {
				primes[item] = i;
				item++;
			}
		}
		
		String fin = "";
		
		for ( int i = 0; i < k; i++ ) {
			fin += primes[i];
			if ( i != k-1 )
				fin += " ";
		}
		System.out.println(fin);
		// System.out.println(Arrays.toString(primes));
	}
	
	public static boolean isPrime(int n) {
		for ( int i = 2; i*i <= n; i++ ) {
			if ( n%i == 0 )
				return false;
		}
		return true;
	}

}