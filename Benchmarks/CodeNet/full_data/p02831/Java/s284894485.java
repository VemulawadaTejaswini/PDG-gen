
import java.util.Scanner;

public class Main {

	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

	private static int lcm(int m, int n) {
	    return m * n / gcd(m, n);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();
		System.out.println(lcm(A,B));
	}


}
