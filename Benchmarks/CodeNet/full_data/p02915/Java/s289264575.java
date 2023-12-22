import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int pass = scan.nextInt();

		System.out.println(Math.pow(pass, 3));
		scan.close();
	}

}
