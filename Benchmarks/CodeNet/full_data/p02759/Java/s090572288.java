import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int page = scan.nextInt();

		System.out.println((page+1)/2);

		scan.close();
	}
}
