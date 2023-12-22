import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		
		if ( N % 500 <= A ) {
			System.out.println("Yes");
			
		} else {			
		System.out.println("No");

		}
	}
}