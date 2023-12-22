import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long ans  = 1;
		for(int i = 0; i < n ;i++) {
			long t = sc.nextLong();
			ans = lcm(t,ans);	
		}
		
		System.out.println(ans);
		
	}
	
	static long gcd(long a , long b) {
		
		long temp = a % b;
		if(temp == 0) {
			return b;
		}
		return gcd(b ,temp);
	}
	
	static long lcm(long a , long b) {
		
		long d = gcd(a,b);
		
		return (a / d * b) ;
	}

}
