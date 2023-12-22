import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.valueOf(scanner.nextLine());
		String S = scanner.nextLine();
		scanner.close();
		
		char[] c = S.toCharArray();
		int initialBlackPoint = 200000;
		String output;
		boolean existBlack = false;
		
		
		for (int i = 0; i < N; i++) {
			if (c[i] == '#') {
				if (!existBlack) {
					existBlack = true;
					initialBlackPoint = i;
					break;
				}
			}
		}
		int counter = 0;
		for (int j = 0; j < N; j++) {
			if (initialBlackPoint <= j && c[j] == '.') {
				counter++;
			}
		}
		System.out.println(counter);
		

	}

}
