import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int count = 0;
		for (int i = 1; i <= n - 1; i++) {
			count+= i;
		}
		for (int i = 1; i <= m - 1; i++) {
			count+= i;
		}
		System.out.println(count);
	}

}
