import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int A = scn.nextInt();
		int B = scn.nextInt();

		int min = Math.max(0, A + B - N);
		int max = Math.min(A,B);
		System.out.println(max + " " + min);
	}

}