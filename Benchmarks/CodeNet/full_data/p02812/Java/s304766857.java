
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		String S = scan.next();
		int count = 0;

		for(int i=0;i<N-2;i++) {

			if(S.charAt(i)=='A' && S.charAt(i+1)=='B' && S.charAt(i+2)=='C') {

				count++;
			}

		}

		System.out.println(count);

		scan.close();

	}
}
