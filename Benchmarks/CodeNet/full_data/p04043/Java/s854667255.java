package practice;
import java.util.*;

public class ABC042A {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int first	= scan.nextInt();
		int second	= scan.nextInt();
		int therd	= scan.nextInt();
		int FIVE	= 0;
		int SEVEN	= 0;
		
		if ((first == 5 | first == 7) & (second == 5 | second == 7) & (therd == 5 | therd == 7) & (first + second + therd == 17)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}