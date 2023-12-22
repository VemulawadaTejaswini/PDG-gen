import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		System.out.println(N%2 == 0?N:2*N);
		scn.close();
	}
}
