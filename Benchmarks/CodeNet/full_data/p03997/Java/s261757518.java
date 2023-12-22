import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();

		double area = ((a + b)* h) /2;
		System.out.println(area);

		scan.close();

	}

}
