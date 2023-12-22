


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean rev = false;
		for (int i=0;i<q;i++) {
			int a = sc.nextInt();
			if (a==1) {
				rev=!rev;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f==1 || rev) {
					s=c+s;
				} else {
					s=s+c;
				}
			}
		}
		System.out.println(rev ? new StringBuilder(s).reverse() : s);



	
	}
	


}



