import java.util.Scanner;
public class Main {
	static long fn(long n) {
		if(n < 2) {
			return 1;
		}
		return n*fn(n-2);
	}




	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long  n = stdIn.nextLong();
		if(n%2 != 0) {
			System.out.println(0);
			System.exit(0);
		}

		long a = fn(n);

		long cnt = 0;

		while(a%10 == 0) {
			cnt++;
			a /=10;
		}
		System.out.println(cnt);


	}

}
