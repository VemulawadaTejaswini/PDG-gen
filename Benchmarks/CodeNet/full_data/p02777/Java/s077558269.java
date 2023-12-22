import java.util.*;

class Main {
	Scanner sc;
	String S, T, U;
	int A, B;
	
	private void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		T = sc.next();
		A = sc.nextInt();
		B = sc.nextInt();
		U = sc.next();
		if (S.equals(U)) A--;
		else B--;
		System.out.println(A+" "+B);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
