import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		if (k * 500 >= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}