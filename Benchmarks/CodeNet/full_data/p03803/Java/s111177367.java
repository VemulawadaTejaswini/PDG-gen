import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if( A == B ){
			System.out.println("Draw");
		}
		else if((A == 1 && B != 1)||( A > B )){
			System.out.println("Alice");
		}
			
		else if((A != 1 && B == 1)||( A < B )){
			System.out.println("Bob");
		}
	}
}
