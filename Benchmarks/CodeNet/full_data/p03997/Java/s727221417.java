import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int h = scanner.nextInt();
		System.out.println( (a + b) * h / 2 );
		scanner.close();
	}
}
