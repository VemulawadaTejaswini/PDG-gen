
import java.util.Scanner;

class Main{
	public static void main(String[] main) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		boolean isA=false;

		char[] mjs=new char[a.length()];
		for(int i=0; i<a.length(); i++) {
			mjs[i]=a.charAt(i);
		}


		if(mjs[0]=='A') {
			isA=true;
			mjs[0]='a';
		}
		else {
			isA=false;
			mjs[0]='a';
		}


		int C_cnt=0;
		for(int i=2 ;i<=a.length()-2; i++) {
			if(mjs[i]=='C') {
				C_cnt++;
				mjs[i]='c';
			}
		}

		boolean caps=true;

		for(int i=0; i<a.length(); i++) {
			if((mjs[i]+"").equals((mjs[i]+"").toLowerCase())) {
				//
			}
			else {
				caps=false;
			}
		}

		if(C_cnt==1 && caps==true && isA==true) {
			System.out.println("AC");
		}
		else {
			System.out.println("WA");
		}
	}
}