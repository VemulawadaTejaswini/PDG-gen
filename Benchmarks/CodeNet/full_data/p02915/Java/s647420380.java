import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(new Main().password(Integer.parseInt(scanner.nextLine())));
		scanner.close();
	}
	
	public int password(int n) {
		int pass = 1;
		for(int i = 0; i < 3; i++) {
			pass *= n;
		}
		return pass;
	}
}