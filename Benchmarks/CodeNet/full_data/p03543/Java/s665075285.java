import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String N = in.nextLine();

		if(N.substring(0,1).equals(N.substring(1,2))&&N.substring(0,1).equals(N.substring(2,3))) {
			System.out.println("Yes");
			System.exit(0);
		}
		if(N.substring(1,2).equals(N.substring(2,3))&&N.substring(1,2).equals(N.substring(3,4))) {
			System.out.println("Yes");
			System.exit(0);
		}
		
		System.out.println("No");
		
		
		in.close();
	}
}