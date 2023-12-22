import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int M1 = stdIn.nextInt();
		int D1 = stdIn.nextInt();
		int M2 = stdIn.nextInt();
		int D2 = stdIn.nextInt();
		
		if(M2 == M1+1) System.out.println(1);
		else System.out.println(0);

	}

}