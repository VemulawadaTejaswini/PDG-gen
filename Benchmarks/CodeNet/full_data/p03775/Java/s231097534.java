
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = (int)Math.log10(n)+1;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i ==0) ans = (int)Math.min(ans, Math.log10(n/i)+1);
		}
		System.out.println(ans);
	}
}
