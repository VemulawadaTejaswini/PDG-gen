import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		sc.close();

		int result = (int)Math.ceil((double)h / a);

		System.out.println(result);
	}
}
