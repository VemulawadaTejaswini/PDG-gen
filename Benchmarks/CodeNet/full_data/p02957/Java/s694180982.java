
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		if((A+B)%2!=0) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		if(A==B) {
			System.out.println(1);
			return;
		}
		System.out.println((A+B)/2);
		
	}
}

