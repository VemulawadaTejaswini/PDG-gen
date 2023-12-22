package atCBC096;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	sc.close();
	int count = 0;
	for(int i = 0; i < input.length(); i++) {
		if(input.charAt(i) == 'o') {
			count++;
		}
	}
	System.out.print(700 + (100 * count));
}
}