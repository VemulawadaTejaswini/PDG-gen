import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		int count = 0;

		for(int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'o') {
				count++;
			}
		}

		count = 700 + (100 * count);
		System.out.println(count);
	}
}