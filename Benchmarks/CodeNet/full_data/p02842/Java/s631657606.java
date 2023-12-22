import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double N = stdIn.nextInt();
		int X = (int)Math.floor(N/1.08);
		
		if((int)((X-1)*1.08) == (int)N) System.out.println(X-1);
		else if((int)(X*1.08) == (int)N) System.out.println(X);
		else if((int)((X+1)*1.08) == (int)N) System.out.println(X+1);
		else System.out.println(":(");

	}

}