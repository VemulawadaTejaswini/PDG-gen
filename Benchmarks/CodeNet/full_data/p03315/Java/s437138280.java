import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kekka=0;
		char[] aa=new char[4];
		String bb="";
		bb=sc.next();
		for(int i=0; i<4; i++) {
			aa[i]=bb.charAt(i);
		}

		for(int i=0; i<4; i++) {
			if(aa[i]=='+') {
				kekka++;
			}
			else if(aa[i]=='-') {
				kekka--;
			}
		}

		System.out.println(kekka);
	}
}