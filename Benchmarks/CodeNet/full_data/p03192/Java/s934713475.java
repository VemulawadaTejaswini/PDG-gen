package atcoder_problem;

import java.util.Scanner;

public class Main {

	public static int getTwoNumbers(String number) {
		
		int index = 0;
		
		char[] chars = number.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i]=='2') {
				index++;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.next();
		
		int twoNumbers = getTwoNumbers(value);
		
		System.out.println(twoNumbers);
	}
}
