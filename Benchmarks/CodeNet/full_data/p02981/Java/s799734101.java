import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		System.out.println(
			N * A < B ? N * A : B 
		);
		scan.close();
	}

}