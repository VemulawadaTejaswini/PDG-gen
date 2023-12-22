import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		long n = stdIn.nextLong();
		long k = stdIn.nextLong();
		
		long min = Math.min(n%k,k-(n%k));
		System.out.println(min);
		
		
		
	}

}
