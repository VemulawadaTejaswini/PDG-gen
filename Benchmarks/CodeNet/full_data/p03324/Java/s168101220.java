import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Declare
		int cnt = 0;

		// Recieve StdIn
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			int an = sc.nextInt();

			while (an%2 == 0) {
				an /= 2;
				cnt++;
			}
		}

		// Display
		System.out.println(cnt);
	}
}
