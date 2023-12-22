import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner push = new Scanner(System.in);
		int n = push.nextInt();

		int A,B,C;

		A = n / 100;
		n =- A;

		B = n / 10;
		n =- B;

		C = n * 100;
		System.out.println(A + B + C);
	}
}
