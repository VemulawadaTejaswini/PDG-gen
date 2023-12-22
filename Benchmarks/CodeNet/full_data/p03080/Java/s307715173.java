import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final char[] hats = scanner.nextLine().toCharArray();
		int r = 0;
		
		for(int i = 0;i<hats.length;i++) {
			if(hats[i] == 'R') {
				r ++;
			}
		}
		
		if(r * 2 > hats.length) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scanner.close();

	}

}