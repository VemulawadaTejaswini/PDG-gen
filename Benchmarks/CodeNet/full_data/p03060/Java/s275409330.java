import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine() );

		String InStr = scan.nextLine();
		String[] sV = InStr.split(" ");

		InStr = scan.nextLine();
		String[] sC = InStr.split(" ");

		int cost = 0;
		int V;
		int C;

		for (int i = 0; i < N; i++) {

			V = Integer.parseInt(sV[i]);
			C = Integer.parseInt(sC[i]);

			if( V - C > 0) {
				cost = cost + (V - C);
			}

		}
		System.out.println(cost);

		scan.close();
	}
}
