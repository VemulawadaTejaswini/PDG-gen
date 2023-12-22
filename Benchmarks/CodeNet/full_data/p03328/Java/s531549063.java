import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int value = b - a;
		int high = 0;
		
		for (int i = 1; i < value - 1; i++) {
			high += i; 
		}

		System.out.println(high - a);

	}
}