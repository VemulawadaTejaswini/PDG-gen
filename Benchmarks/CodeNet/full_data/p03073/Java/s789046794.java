

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] tile = sc.next().toCharArray();
		int firstpattern = 0;
		int secondpattern = 0;
		for(int i = 0; i < tile.length; i++) {
			if((i % 2 == 0) && (tile[i] == '0')) {
				firstpattern++;
			}
			if((i % 2 == 1) && (tile[i] == '1')) {
				firstpattern++;
			}
		}
		for(int i = 0; i < tile.length; i++) {
			if((i % 2 == 0) && (tile[i] == '1')) {
				secondpattern++;
			}
			if((i % 2 == 1) && (tile[i] == '0')) {
				secondpattern++;
			}
		}
		System.out.println(Integer.min(firstpattern, secondpattern));

	}

}
