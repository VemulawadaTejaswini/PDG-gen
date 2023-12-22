import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long sum = Long.MAX_VALUE;
		
		for (long i = 1; i <= a; i++) {
			if(a%i == 0) {
				if (i > a/i) break;
				//System.out.println(i +" "+  a/i);
				if(sum > i + a/i) sum = i + a/i - 2;
				if(isPrime(a/i))break;
			}
		}
		 
		System.out.println(sum);
	
	}
	
	public static boolean isPrime(long n) {
		if (n < 2) {
	        return false;
	    }
	    if (n % 2 == 0) {
	        return (n == 2);
	    }

	    for (long i = 3; i * i <= n; i += 2) {    //奇数のみ [O(√n[/2])で可]
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}