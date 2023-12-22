import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		long N = scanner.nextLong();
		long ans=0;

		for(long i=1; i<=N ;i++) {
			boolean three = (i%3==0);
			boolean five = (i%5==0);
			if(!three && !five) {
				ans+=i;
			}
		}
		System.out.println(ans);
	}


}
