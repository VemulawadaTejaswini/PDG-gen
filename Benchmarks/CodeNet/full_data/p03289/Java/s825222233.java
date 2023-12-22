import java.util.Scanner;

public class Main{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	String S =sc.next();
	int L = S.length();
	String str = S.substring(2,L-1);

//	System.out.println(L+", "+str);
//	System.out.println(str.indexOf("C"));
//	System.out.println(str.lastIndexOf("C"));

	if(str.contains("C")){
		if (str.indexOf("C") == str.lastIndexOf("C")){
			System.out.println("AC");
		}
		else {
			System.out.println("WA");
		}
	}
	else {
		System.out.println("WA");
	}
	}
}