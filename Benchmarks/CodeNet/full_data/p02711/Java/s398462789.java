import java.io.*;
import java.util.Scanner;

public class Main{

	static int n;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 n= sc.nextInt();
			 int rem;
			 int flag=0;
			 while(n>0){
			 	rem=n%10;
			 	if(rem==7)
			 		flag=1;
			 	n=n/10;
			 }
			if(flag==1)
				System.out.print("Yes");
			else
				System.out.print("No");
		}
	}

