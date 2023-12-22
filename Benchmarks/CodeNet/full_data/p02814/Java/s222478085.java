import java.util.Scanner;

public class Main {
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long L = 1;
		for(int i = 0 ; i < N ; ++i){
			long a = sc.nextLong();
			long b = a / 2;
			L = (L * b) / gcd(L , b);
		}
		long ret = 0;
		if(M < L){
			ret = 0;
		}else{
			ret = (M - L) / (2 * L) + 1;
		}
		System.out.println(ret);
	}
}
