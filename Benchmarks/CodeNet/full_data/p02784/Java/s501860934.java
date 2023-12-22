import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int n = input.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			a += input.nextInt();
		}
		if (a > h) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}