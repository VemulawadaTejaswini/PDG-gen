

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		sc.close();
		
		int p_ex=A*3;
		
		
		System.out.println((p_ex+P)/2);

	}

}
