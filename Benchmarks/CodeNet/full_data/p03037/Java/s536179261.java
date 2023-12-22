import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int cardNums[] = new int[2 * M + 1];

		for ( int i = 1; i <= M; i++ ) {
			cardNums[i] = in.nextInt();
			cardNums[i + M] = in.nextInt();
		}

		int limR = cardNums[2 * M];
		int limL = cardNums[1];
		for ( int i = 1; i <= M; i++ ) {

			if ( limL < cardNums[i] ) {
				limL = cardNums[i];
			}

			if ( cardNums[i + M] < limR ) {
				limR = cardNums[i + M];
			}
		}
		
		System.out.println(limR - limL + 1);
		in.close();
	}
}