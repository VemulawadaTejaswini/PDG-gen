import java.io.*;
import java.util.Scanner;

public class Main{

	static long n,k;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 n= sc.nextLong();
			 k= sc.nextLong();

			 long x=n%k;
			 long min=x;

			 if(min>Math.abs(x-k)){
			 	min=Math.abs(x-k);
			 }
			 System.out.print(min);
			}
		}

