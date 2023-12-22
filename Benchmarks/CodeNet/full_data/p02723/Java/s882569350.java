import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		
		String three = S.substring(2,3);
		String four = S.substring(3,4);
		String five = S.substring(4,5);
		String six = S.substring(5,6);
		
		if(three.equals(four) && five.equals(six)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
