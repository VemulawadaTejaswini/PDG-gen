

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String output = "No";

		Integer nInteger = new Integer(scanner.next());

		for(int i= 0,iLen = (nInteger/7+1);i < iLen;i++) {
			for(int j = 0,jLen = ((nInteger-i*7)/4)+1;j<jLen;j++) {
				if(nInteger == (i*7+j*4)) {
					output = "Yes";
					break;
				}
			}
		}
		System.out.println(output);
		scanner.close();
	}
}
