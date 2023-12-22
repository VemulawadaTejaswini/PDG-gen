import java.io.*;
import java.util.Scanner;

public class Main{

	static long n,k;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 n= sc.nextLong();
			 k= sc.nextLong();

			 long ans=replace(n,k);
			 System.out.print(ans);
			}

			static long replace(long n, long k){
				long j=n;
				if(n<k)
					return n;
				if(n>1000)
					return 0;
				while(j>=0){
					j=n-k;
					n=Math.abs(n-k);
				}
				return n;
			}
		}

