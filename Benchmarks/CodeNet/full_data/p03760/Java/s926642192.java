

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);

		String O=sc.next();
		String E=sc.next();
		String res="";
		if(O.length()>E.length()) {
			for(int i=0; i<E.length(); i++) {
				res=res+O.charAt(i)+""+E.charAt(i);
			}
			res=res+O.charAt(O.length()-1)+"";
			System.out.println(res);
		}

		if(O.length()==E.length()) {
			for(int i=0; i<E.length(); i++) {
				res=res+O.charAt(i)+""+E.charAt(i);
			}
			System.out.println(res);
		}
	}
}