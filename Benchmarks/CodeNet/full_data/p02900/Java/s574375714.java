import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long gcd = gcd(a,b);
		
		System.out.println(prime(gcd));

	}
	
	static long gcd(long a ,long b) {
		if(b > a)
			return gcd(b,a);
		if(a % b == 0)
			return b;
		
		return gcd(b ,a%b);
	}

	static long prime(long n) {
		
		long d = n;
		long count = 1;
		
		for(long i = 2 ; i* i <= d ; i++) {
			if(n % i == 0) {
				count++;
				while(n % i == 0) {
					n = n/i;
				}
			}
		}
		if(n != 1)
			count++;
		
		return count;
		}
}
