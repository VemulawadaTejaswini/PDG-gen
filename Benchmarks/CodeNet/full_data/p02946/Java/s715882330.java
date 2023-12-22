import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int X = sc.nextInt();

		int start = X - (K - 1);
		int end   = X + (K - 1);

		for (int i=start; i<=end; i++){
			if (i > start){
				System.out.print(" ");
			}
			System.out.print(i);
		}

	}
}