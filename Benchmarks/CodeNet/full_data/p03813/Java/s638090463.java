import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		
		System.out.println(limit < 1200 ? "ABC" : "ARC");
	}
}