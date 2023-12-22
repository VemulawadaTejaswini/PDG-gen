import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i = 1 ; i <= b ; i++) {
			if(a * i % b == c) {
				System.out.println("Yes");
				break;
			}
		}
		System.out.println("No");
	}
}
