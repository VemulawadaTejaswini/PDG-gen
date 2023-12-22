
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		String[] square = new String[x];
		for (int i = 0; i < square.length; i++) {
			square[i] = scan.next();
		}
		
		boolean[] row = new boolean[x];
		boolean[] col = new boolean[y];
		
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (square[i].charAt(j) == '#') {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				for (int j = 0; j < col.length; j++) {
					if (col[j]) {
						System.out.print("#");
					}
				}
			}
			System.out.println();
		}
}