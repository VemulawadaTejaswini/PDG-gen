

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a!=b && a!=c && b==c) {
			System.out.println(a);
		}

		if(b!=a && b!=c && a==c) {
			System.out.println(b);
		}

		if(c!=b && c!=a && a==b) {
			System.out.println(c);
		}

		System.out.println(b*2-a);
	}
}