package abc042;

import java.util.Scanner;

public class Iroha_and_Haiku {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();

		if(A == 5 && B == 5 && C == 7)
			System.out.println("Yes");
		else if(A == 5 && B == 7 && C == 5)
			System.out.println("Yes");
		else if(A == 7 && B == 5 && C == 5)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}