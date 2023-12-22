

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();

		if(A<B) {
			if(A+W>=B) {
				System.out.println(0);
			}
			else if(A+W<B) {
				System.out.println(B-A-W);
			}
		}
		else if(A==B) {
			System.out.println(0);
		}
		else if(A>B) {
			if(B+W>=A) {
				System.out.println(0);
			}
			else if(B+W<A) {
				System.out.println(A-B-W);
			}
		}
	}
}