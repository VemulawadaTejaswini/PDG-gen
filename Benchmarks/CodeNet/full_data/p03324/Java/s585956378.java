import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int d = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(Math.pow(100, d) * n);
	}

}
