import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long M = input.nextLong();
		if (N%2==1&&M%2==1) System.out.println(M*N/2+1);
		else System.out.println(M*N/2);
	}
}