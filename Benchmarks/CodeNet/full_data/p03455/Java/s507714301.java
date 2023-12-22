import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = a * b;
		if(ab % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
	}

}