
import java.util.Scanner;

public class Main {

	public static long F(long A, long B) {
		return Math.max(String.valueOf(A).length(), String.valueOf(B).length());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long B = 0;

		for(long i=(long)Math.sqrt(N); i >=1 ; i--) {
			if(N%i==0) {
				B=N/i;
				System.out.println(F(i, B));
				break;
			}
		}
		scan.close();
	}
}
