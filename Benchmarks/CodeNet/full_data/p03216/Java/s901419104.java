import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int q=sc.nextInt();
		int k[]=new int[q];
		for(int i=0;i<q;++i) {
			k[i]=sc.nextInt();
		}
		long countd=0;
		long countc=0;
		
		long leftval[]=new long[n];
		long rightval[]= new long[n];
		
		for(int i=0;0<n;++i) {
			if(s.charAt(i)=='D')++countd;
			else if(s.charAt(i)=='M')leftval[i]=countd;
			else leftval[i]=0;
			if(s.charAt(n-1-i)=='C')++countc;
			else if(s.charAt(n-1-i)=='M')rightval[n-1-i]=countc;
			else rightval[n-1-i]=0;
		}
		for(int i=0;i<q;++i) {
			System.out.println(rightval[k[i]]*leftval[k[i]]);
		}
	}
}