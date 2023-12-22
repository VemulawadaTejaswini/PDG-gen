import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int t = scan.nextInt();
		scan.close();

		System.out.println((x-t>0)? x-t:"0");

	}

}