import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int t = b - a;
		int i = 0;
		int h = 0;
		for(i = 1; i <= t; i++) {
			h = h + i; 
		}
		int snow = h - b;
		System.out.println(snow);
	}
}