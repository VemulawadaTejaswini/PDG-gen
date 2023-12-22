import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		out.println(sc.nextInt()/3);
	}
	
	public static void B(Scanner sc) {
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(sc.next().charAt(0)=='Y') {
				out.println("Four");
				return;
			}
		}
		out.println("Three");
	}
}
