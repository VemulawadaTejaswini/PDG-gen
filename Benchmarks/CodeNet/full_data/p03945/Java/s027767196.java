

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine().trim();
		int count = 0;
		char current = line.charAt(0);
		
		for (int i = 1; i < line.length(); i++) {
			if (current == line.charAt(i)) {
				continue;
			} else {
				count++;
				current = line.charAt(i);
			}
		}
		
		System.out.println(count);
	}

}
