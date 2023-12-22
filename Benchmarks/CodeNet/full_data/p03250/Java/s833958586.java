import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		int Max = Math.max(A, Math.max(B, C));
		System.out.println(Max * 10 + A+B+C-Max);
		scn.close();
	}
}
