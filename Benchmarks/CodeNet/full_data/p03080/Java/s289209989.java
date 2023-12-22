import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// input process
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String s = scanner.nextLine();

		// initialization
		int redCount = 0;
		int blueCount = 0;

		// count process
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'R') {
				redCount++;
			}else {
				blueCount++;
			}
		}

		// output process
		if(redCount>blueCount) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}