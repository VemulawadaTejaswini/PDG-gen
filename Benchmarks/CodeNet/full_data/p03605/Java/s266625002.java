import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N % 10 == 9 || N >= 90){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}



