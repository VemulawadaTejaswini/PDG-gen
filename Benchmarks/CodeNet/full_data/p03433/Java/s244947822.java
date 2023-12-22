import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A(sc);
	}
	
	public static void A(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		if(N%500 <=A) out.println("Yes");
		else out.println("No");
	}
}
