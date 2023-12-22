import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int power = sc.nextInt();
		int number = sc.nextInt();
		System.out.println((int)(Math.pow(100, power)*number));

	}

}