package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String a;
		a=br.readLine();
		int n=a.length();
		int d[]=new int[n];
		int b=0,c=0;
		for(int i=0;i<n;i++) {
			d[i]=a.charAt(i)-48;
			if(d[i]==1)b++;
			else c++;
		}
		c*=2;b*=2;
		if(c<=b) System.out.print(c);
		else System.out.print(b);
	}
}
