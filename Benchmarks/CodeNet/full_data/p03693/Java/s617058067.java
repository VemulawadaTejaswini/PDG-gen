import java.util.*;

public class Main{ // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();
		
		if((g*10+b) % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
				
		scanner.close();
	}
}