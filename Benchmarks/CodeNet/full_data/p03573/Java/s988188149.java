import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		if(A == B) {
			System.out.println(C);
		}else if(B == C) {
			System.out.println(A);
		}else if(C == A) {
			System.out.println(B);
		}
	}
}