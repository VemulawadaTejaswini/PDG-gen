import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		double h = scan.nextInt();
		double a = scan.nextInt();
		
		System.out.println((int)Math.ceil(h/a));
		
	}
}