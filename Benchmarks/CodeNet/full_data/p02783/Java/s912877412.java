import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int A = scanner.nextInt();
		System.out.println((H -1) / A+1);
	}

}
