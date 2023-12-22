import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double N = stdIn.nextInt();
		double D = stdIn.nextInt();
		
		System.out.println((int)Math.ceil(N/(2*D+1)));

	}

}