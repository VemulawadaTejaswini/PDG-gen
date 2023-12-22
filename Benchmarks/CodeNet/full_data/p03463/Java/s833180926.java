import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if((b-a-1)%2 == 0) {
			System.out.println("Borys");
		} else {
			System.out.println("Alice");
		}
	}

}
