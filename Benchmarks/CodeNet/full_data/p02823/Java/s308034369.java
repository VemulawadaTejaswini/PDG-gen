import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		
		if((B-A)%2 == 0) System.out.println((B-A)/2);
		else System.out.println(Math.min(B-1,N-A));

	}

}