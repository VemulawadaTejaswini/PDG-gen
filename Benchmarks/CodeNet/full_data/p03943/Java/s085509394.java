package Comp;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a == b + c || b==a+c || c==b+a )
			System.out.println("yes");
		else 
			System.out.println("no");
	}
}
