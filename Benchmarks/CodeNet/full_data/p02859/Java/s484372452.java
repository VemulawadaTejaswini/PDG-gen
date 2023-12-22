import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = 3.14159265359;
		
		double a = r * r * pi;
		System.out.println((int)Math.floor(a/pi));

	}

}