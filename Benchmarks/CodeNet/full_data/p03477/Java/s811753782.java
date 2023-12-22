import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int balance = (A + B) - (C + D);
		if (balance > 0) { 
			System.out.println("Left"); 
		} else if (balance == 0) {
			System.out.println("Balanced"); 
		} else {
			System.out.println("Right"); 
		}
	}
}
