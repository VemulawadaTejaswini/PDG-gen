import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int ans = (int)Math.ceil(n/(2*d+1.0));
		
		System.out.println(ans);
		
	}

}
