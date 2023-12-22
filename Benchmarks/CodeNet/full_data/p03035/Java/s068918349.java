import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a >= 13) {
			System.out.println(sc.nextInt());
		} else if (a >= 6) {
			System.out.println((int) (sc.nextInt() / 2.));
		} else {
			System.out.println(0);
		}
	}
}
