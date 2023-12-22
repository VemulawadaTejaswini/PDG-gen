import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);


		String b = scan.nextLine();

		if(b.length()<4) {
			System.out.print("No");
		}else {
			if(b.charAt(0) == 'Y'  && b.charAt(1) == 'A'  && b.charAt(2) == 'K'  && b.charAt(3) == 'I') {System.out.print("No");}
			else {
			System.out.print("Yes");
		}}

	}

}
