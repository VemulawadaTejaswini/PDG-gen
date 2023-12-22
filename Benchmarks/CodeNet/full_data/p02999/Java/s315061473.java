import java.util.Scanner;

/**
 * 2019/06/15
 * AtCoder Beginner Contest 130
 * 
 * A - Rounding
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int A = sc.nextInt();

		int result;
		if(X < A) {
			result = 0;
		} else {
			result = 10;
		}
		
		System.out.println(result);
	}
	
}