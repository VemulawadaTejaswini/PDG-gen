import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b){
			System.out.println(c);
		} else if (b == c){
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}
}
