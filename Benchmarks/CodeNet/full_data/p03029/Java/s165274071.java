import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int a = sc.nextInt();
		int p = sc.nextInt();
		int result;

		result = (a*3+p)/2;

		System.out.println(result);
	}
}
