import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int count = 0;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 3; j < n; j++) {
				if (s.substring(i, j).equals("ABC")) {
					count++;
				}
			}
		}
		System.out.println(count);
		scan.close();
 	}
}
