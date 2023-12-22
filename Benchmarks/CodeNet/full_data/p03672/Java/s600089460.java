

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char[] b=new char[a.length()];

		for(int i=0; i<a.length(); i++) {
			b[i]=a.charAt(i);
		}

		int mojisu=a.length();
		if(mojisu%2==1) {
			int cut=1;
			boolean bb=true;
			for(int i=0; i<(a.length()-1)/2; i++) {
				bb=true;
				for(int j=0; j<(mojisu-cut)/2; j++) {
					if(b[j]!=b[j+(mojisu-cut)/2]) {
						bb=false;
						break;
					}
				}

				if(bb==true) {
					System.out.println(mojisu-cut);
					System.exit(0);
				}

				cut+=2;
			}
		}
		else if(mojisu%2==0) {
			int cut=2;
			boolean bb=true;
			for(int i=0; i<(a.length())/2-1; i++) {
				bb=true;
				for(int j=0; j<(mojisu-cut)/2; j++) {
					if(b[j]!=b[j+(mojisu-cut)/2]) {
						bb=false;
						break;
					}
				}

				if(bb==true) {
					System.out.println(mojisu-cut);
					System.exit(0);
				}
				cut+=2;
			}
		}
	}
}