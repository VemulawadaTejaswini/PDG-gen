import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int D = input.nextInt();
		int N = input.nextInt();
		int[] arr = new int[100];
		if (D==0) {
			if (N<=99) System.out.println(N);
			else System.out.println(101);
		}else if (D==1) System.out.println(100*N);
		else if (D==2) System.out.println(10000*N);
	}
}