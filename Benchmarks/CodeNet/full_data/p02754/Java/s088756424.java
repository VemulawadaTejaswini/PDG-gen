import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    long A = sc.nextLong();
	    long B = sc.nextLong();

	    long ans = 0;

	    while (N > A) {

	    	N -= A;
	    	ans += A;

	    	if (N >= B) { N -= B; }
	    }

	    ans += N;

	    System.out.println(ans);
		}
}