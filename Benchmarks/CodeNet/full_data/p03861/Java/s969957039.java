
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		if( b%x!=0 ) {
			System.out.println((b-a)/x);
		}else {
			System.out.println((b-a)/x+1);
		}
	}
}
