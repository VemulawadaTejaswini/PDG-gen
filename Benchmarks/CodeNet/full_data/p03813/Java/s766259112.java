import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		if(x < 1200) {
			System.out.println("ABC");
		}else {
			System.out.println("ARC");
		}

	}

}