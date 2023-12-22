import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[]a = new int[n];
		
		//3 5 6 11 31
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (5 * (i + 1)) + 1;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i + 1 <a.length) {
				System.out.print(" ");
			}
		}
		System.out.println();
		scanner.close();

	}
	


}
