import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int height_l =0;
		for(int i=1;i<(b-a);i++) {
			height_l += i;
		}
		System.out.println(height_l-a);

	}

}
