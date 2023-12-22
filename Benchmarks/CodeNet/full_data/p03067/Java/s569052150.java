import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			if(i == c) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
