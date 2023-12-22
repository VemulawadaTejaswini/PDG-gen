import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int n = (int)Math.sqrt(N);
		for (int i=n; i>=1; i--) {
			if ( N%i==0 ) {
				System.out.println(String.valueOf(N/i).length());
				break;
			}
		}
	}
}
