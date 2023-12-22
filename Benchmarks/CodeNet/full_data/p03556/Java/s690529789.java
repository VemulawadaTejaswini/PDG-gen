import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int heihou = (int) Math.sqrt(a);
		System.out.println(heihou*heihou);

	}
}