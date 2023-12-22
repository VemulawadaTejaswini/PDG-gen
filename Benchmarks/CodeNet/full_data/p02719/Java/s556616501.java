import java.io.*;
import java.util.Scanner;

public class Main{

	static int temp=0,n,k;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 n= sc.nextInt();
			 k= sc.nextInt();

			 replace(n,k);
			}

			static int replace(int n, int k){
				if(n<k)
					return n;
				while(n>=0){
					n=Math.abs(n-k);
				}
				return n;
			}
		}

