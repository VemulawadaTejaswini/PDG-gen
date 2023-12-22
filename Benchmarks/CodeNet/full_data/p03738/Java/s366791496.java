import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt(); 
		long B = sc.nextInt(); 
		if(A > B) {
			System.out.println("GREATER");
		} else if(A < B) {
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
	}
}