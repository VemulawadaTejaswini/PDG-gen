import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long ans = 0;
		for(long i=1;i*i<n;i++) {
			if(n%i==0) ans += n/i - 1;
		}
		System.out.println(ans);
		in.close();
	}

}
