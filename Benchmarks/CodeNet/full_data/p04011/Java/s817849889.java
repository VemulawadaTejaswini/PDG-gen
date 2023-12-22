import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int x = (N-(N-K))*X;
		int y = (N-K)*Y;
		


		System.out.println(x+y);


	}
}
