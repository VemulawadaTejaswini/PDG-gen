import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int curtainA = sc.nextInt();
		int curtainB = sc.nextInt();

		if (curtainA <= (curtainB * 2)) {
			System.out.println("0");
		} else {
			System.out.println(curtainA - (curtainB * 2));
		}
	}

}