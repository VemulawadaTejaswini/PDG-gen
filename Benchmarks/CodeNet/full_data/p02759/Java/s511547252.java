import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int c = N%2;
		if( c == 0) {
			System.out.println(N/2);
		}else{
			System.out.println((N+1)/2);
		}

	}
}
