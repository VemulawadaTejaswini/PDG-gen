import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long l = stdIn.nextInt();
		long r = stdIn.nextInt();
		
		long ll = l%2019;
		
		if(ll==2018) {
			System.out.println(0);
		}else {			
			System.out.println(ll*(ll+1));
		}
		
	}

}
