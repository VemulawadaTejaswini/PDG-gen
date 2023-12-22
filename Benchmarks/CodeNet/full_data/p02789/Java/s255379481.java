import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ko = scan.nextInt();
		int ok = scan.nextInt();

		System.out.println(ko==ok?"Yes":"No");

		scan.close();

	}

}
