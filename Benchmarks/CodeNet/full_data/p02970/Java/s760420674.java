import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int D = scn.nextInt();
		int DD = 2 * D + 1;
		System.out.println((N%D == 0)?N/D:N/D+1);
	}

}