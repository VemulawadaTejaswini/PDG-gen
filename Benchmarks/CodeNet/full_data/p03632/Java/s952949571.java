import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if(B <= C || D <= A) {
			System.out.println(0);
		} else if(C < B && B <= D && A <= C) {
			System.out.println(B - C);
		} else if(A <= C && D < B) {
			System.out.println(D - C);
		} else if(C < A && A <= D && D <= B) {
			System.out.println(D - A);
		} else {
			System.out.println(B - A);
		}
				
	}
}
