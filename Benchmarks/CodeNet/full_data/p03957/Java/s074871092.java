package datht.grab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// get a string
		String s = sc.next();
		boolean res = false;
		int count = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C') {	
				count = i;
				break;
			}
		}
		if (count >= 0) {
			
			for (int i = count; i < s.length(); i++) {
				if (s.charAt(i) == 'F') {	
					res = true;
					break;
				}
			}
			
		}

		if (res) {
			System.out.println("Yes");
		}else System.out.println("No");
		
	}

}
