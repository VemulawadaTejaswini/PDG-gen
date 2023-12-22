import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(0 < n && n < 10) {
			if(0 < m && m < 10) {
				System.out.println(n*m);
				return;
			}
		}
		
		System.out.println(-1);

	}
}
