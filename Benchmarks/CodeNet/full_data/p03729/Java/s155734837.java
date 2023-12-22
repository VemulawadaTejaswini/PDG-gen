
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		if(A.charAt(A.length() - 1) == B.charAt(0)){
			if(B.charAt(B.length() - 1) == C.charAt(0)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
