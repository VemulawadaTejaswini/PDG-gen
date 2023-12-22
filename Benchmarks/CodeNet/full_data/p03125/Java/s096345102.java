
import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, B, ans;
		A = in.nextInt();
		B = in.nextInt();
		
		if (B%A == 0) ans = A+B;
		else ans = B -A;
		
		System.out.println(ans);
	}
}
