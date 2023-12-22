import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String marbles = scanner.next();
		int count = 0;
		
		for (int i = 0; i < marbles.length(); i++) {
			if (marbles.charAt(i) == '1') {
				count++;
			}
		}

		System.out.println(count);
		
		scanner.close();
	}
}