import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long N = scan.nextLong();
			long A = scan.nextLong();
			long B = scan.nextLong();


			if(A>B) {
				System.out.println(0);
				return;
			}

			if(N==1&& A!=B) {
				System.out.println(0);
				return;
			}

			if(N==1) {
				System.out.println(1);
				return;
			}

			long max = A+B+(N-2)*B;
			long min = A+B+(N-2)*A;

			System.out.println(max-min+1);



		}


	}


}
