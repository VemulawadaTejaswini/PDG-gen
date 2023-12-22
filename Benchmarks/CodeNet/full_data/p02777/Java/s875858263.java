import java.util.Scanner;

//AtCoder Beginner Contest 154
//A	Remaining Balls
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		String U = sc.next();
		sc.close();

		if (S.equals(U)) {
	 		System.out.println(--A + " " + B);
		} else {
	 		System.out.println(A + " " + --B);
		}
	}
}
