import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			double ar = Math.sqrt((double)a);
			double br = Math.sqrt((double)b);
			double cr = Math.sqrt((double)c);

			if((ar + br) < cr) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
