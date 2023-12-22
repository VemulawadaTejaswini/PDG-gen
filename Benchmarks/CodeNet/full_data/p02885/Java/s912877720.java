package program;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - (2 * b);
		if(c > 0) {
			System.out.println(c);
		} else {
			System.out.println(0);
		}
	}
}
