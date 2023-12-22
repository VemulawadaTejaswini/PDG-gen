

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();

		int st=0;
		int gl=a.length()-1;


		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='A') {
				st=i+1;
				break;
			}
		}

		for(int i=a.length()-1; i>=0; i--) {
			if(a.charAt(i)=='Z') {
				gl=i+1;
				break;
			}
		}
		System.out.println(gl-st+1);
	}
}