import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		double v = Math.pow((d/3), 3);
		System.out.println((long)v);
	}
}