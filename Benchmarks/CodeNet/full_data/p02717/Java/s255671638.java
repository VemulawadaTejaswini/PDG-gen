import java.io.*;
import java.util.Scanner;

public class abc{

	static int temp=0,a,b,c;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 a= sc.nextInt();
			 b= sc.nextInt();
			 c= sc.nextInt();
		

		temp=a;
		a=b;
		b=temp;

		temp=a;
		a=c;
		c=temp;

		System.out.print(a+" "+b+" "+c);
	}
}
