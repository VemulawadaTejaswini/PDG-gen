import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println((Math.abs(x-a)>Math.abs(x-b))? "B":"A");
	}
}