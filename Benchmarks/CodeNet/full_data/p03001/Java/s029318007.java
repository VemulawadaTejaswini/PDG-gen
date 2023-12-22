import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int multi = 0;
		if (x * 2 == w && y * 2 == h) {
			multi = 1;
		}
		
		double ans = (double) w * h / 2;
		
		System.out.printf("%f %d", ans, multi);
		
		scan.close();
	}

}