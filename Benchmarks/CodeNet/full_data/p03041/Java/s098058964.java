import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();

		for(int i = 0; i < n; i++) {
			if(i == m-1) {
				System.out.print(s.toLowerCase().charAt(i));
			} else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}
}