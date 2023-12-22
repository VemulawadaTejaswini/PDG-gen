import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t=0;
		int nn = 31;
		while(true){
			if(isPrime(nn)){
				t++;
				System.out.print(nn+ " ");
				if(t==n){
					break;
				}
			}
			nn++;
		}
		
	}
	private static boolean isPrime(int n){
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0 || n%5!=1){
				return false;
			}
		}
		return true;
	}
}
