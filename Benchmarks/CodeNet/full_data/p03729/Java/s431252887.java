package sample;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		if(a.charAt(a.length()-1)==b.charAt(0) && c.charAt(0)==b.charAt(b.length()-1)){
			System.out.print("YES");
		}else{
			System.out.print("NO");
		}

	sc.close();
	}

}