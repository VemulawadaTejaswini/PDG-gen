import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long l = stdIn.nextInt();
		long r = stdIn.nextInt();
		
		long ll = l%2019;
		
		System.out.println(ll*(ll+1)%2019);
		
	}

}
