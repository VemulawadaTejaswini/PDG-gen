

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String moto=sc.next();
		int aa=Integer.parseInt(moto.charAt(0)+"");
		int keta=moto.length()-1;
		System.out.println(keta*9+aa-1);
	}
}