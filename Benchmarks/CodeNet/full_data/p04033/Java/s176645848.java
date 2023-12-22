import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<0) {
			if(b<0) {
				if((a+b)%2 == 0) {
					System.out.println("Negative");
				} else {
					System.out.println("Positive");
				}
			} else {
				System.out.println("Zero");
			}
		} else if(a == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positive");
		}
	}
}
