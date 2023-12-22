import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		long count = 0;
		for(long i=0;i<n;i++){
			long p = scanner.nextLong();
			count += scanner.nextLong();

			if(count >= k){
				System.out.println(p);
				break;
			}
		}
	}
}