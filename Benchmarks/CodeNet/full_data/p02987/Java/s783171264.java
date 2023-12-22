import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		char A = S.charAt(0);
		char B = S.charAt(1);
		char C = S.charAt(2);
		char D = S.charAt(3);
		
		boolean ans = false;
		
		if (A==B) {
			if (C==D && A!=C)
				ans = true;
		}
		
		else if (A==C) {
			if (B==D && A!=B)
				ans = true;
		}
		
		else if (A==D) {
			if (B==C && A!=B)
				ans = true;
		}
		
		if (ans==false)
			System.out.println("No");
		else 
			System.out.println("Yes");
		sc.close();

	}

}