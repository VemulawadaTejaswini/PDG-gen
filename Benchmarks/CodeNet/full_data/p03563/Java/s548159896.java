import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float now = sc.nextFloat();
		float will = sc.nextFloat();

		will = will * 2;
		float res = will - now;
		System.out.println((int)res);
	}
}