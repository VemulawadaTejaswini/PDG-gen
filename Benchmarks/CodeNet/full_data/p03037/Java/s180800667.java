//package atCoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int numberOfGate = sc.nextInt();
		int LLimit = sc.nextInt();
		int RLimit = sc.nextInt();

		for(int i=1;i<numberOfGate;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			if(LLimit<l)
				LLimit = l;
			if(RLimit>r)
				RLimit = r;
		}
		sc.close();

		System.out.println(RLimit-LLimit >=0?RLimit-LLimit+1:0);
	}
}
