package atcoder_problem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.next();
		
		int index = 0;
		
		char[] chars = value.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i]=='2') {
				index++;
			}
		}
		System.out.println(index);
	}
}
