import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		int value = a * b;

		if(value % 2 == 1) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}
}