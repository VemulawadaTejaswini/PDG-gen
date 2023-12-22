import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);

		// input
		int num = scan.nextInt();
		int m = scan.nextInt();
		
		// check
		int answer = (1900 * m + 100 * (num - m)) * (int)Math.pow(2, m);
		
		// answer
		System.out.println(answer);
		
	}
		
}