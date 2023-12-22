import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sqrt = (long)Math.sqrt(n);

        for(long i = sqrt; i > 0; i--) {
        	if(n % i == 0) {
        		long j = n/i;

        		System.out.println(i+j-2);
        		return;
        	}
        }

        return;
    }
}