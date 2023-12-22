import java.util.*;

public class Main {
	
	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		long a = sc.nextLong();
//		long b = sc.nextLong();
//		long k = sc.nextLong();
//		if (a - k <= 0) {
//			System.out.println(0 + " " + (b + a - k));
//		} else {
//			System.out.println((a - k) + " " + b);
//		}
		int a = sc.nextInt();
		while(true) {
			if (isPrime(a)) {
				System.out.println(a);
				break;
			}
			++a;
		}
		
		sc.close();
	}

}
