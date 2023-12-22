import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int r = stdIn.nextInt();
		int d = stdIn.nextInt();
		int x = stdIn.nextInt();
		
		int[] reki = new int[11];
		reki[0] = x;
		
		for(int i = 1; i < reki.length; i++) {
			reki[i] = r*reki[i-1] - d;
		}
		
		for(int i = 1; i < reki.length; i++) {
			System.out.println(reki[i]);
		}
		
		
		
		
	}

}
