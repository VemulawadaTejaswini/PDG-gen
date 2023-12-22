

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();

		if(A.length()>B.length()) {
			int diff=A.length()-B.length();
			for(int i=0; i<diff; i++) {
				B="0"+B;
			}
		}
		else if(A.length()<B.length()) {
			int diff=B.length()-A.length();
			for(int i=0; i<diff; i++) {
				A="0"+A;
			}
		}

		for(int i=0; i<A.length(); i++) {
			int AA=Integer.parseInt(A.charAt(i)+"");
			int BB=Integer.parseInt(B.charAt(i)+"");

			if(AA>BB) {
				System.out.println("GREATER");
				System.exit(0);
			}

			else if(AA<BB) {
				System.out.println("LESS");
				System.exit(0);
			}
		}
		System.out.println("EQUAL");
	}
}