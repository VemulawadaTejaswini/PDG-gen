import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int X = s.nextInt();
		System.out.println(X == 3 || X == 5 || X == 7? "YES" : "NO" );
	}
}