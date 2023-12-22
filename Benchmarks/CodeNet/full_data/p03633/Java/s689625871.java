import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextLong();
		long t;
		long ans = stdIn.nextLong();
		for(long i=1; i<n; i++){
			t = stdIn.nextLong();
			ans = lcd(ans,t);
		}

		System.out.println(ans);

		stdIn.close();
	}

	static long lcd(long a,long b){
		long p = a;
		long q = b;
		long r = a % b;
		while(r != 0){
			p = q;
			q = r;
			r = p % q;
		}
		return a / q * b;
	}
}