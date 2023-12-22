

import java.util.Scanner;

class main {
	public static void main(String[] args) {
	Scanner Cf=new Scanner(System.in);
	String Jigsaw=Cf.next();
	int cutoff=Cf.nextInt();
	int x=0;
	String printer="";
	for(int i=0;i<Jigsaw.length();i++) {
		if(x==0) {
			printer=printer+Jigsaw.charAt(i);
		}
		x++;
		if(x==cutoff) {
			x=0;
		}
	}
	System.out.println(printer);
	
	}
	
}
