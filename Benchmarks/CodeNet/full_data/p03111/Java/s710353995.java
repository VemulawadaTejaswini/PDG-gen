import java.util.*;
import java.io.*;

public class Main 
{
	static int a;static int b;static int c;static int n;
	static int[]bamboos;
	public static void main(String[] args) throws IOException 
	{ 
		Scanner s = new Scanner(System.in);
		 n=s.nextInt();
		 a=s.nextInt();
		 b=s.nextInt();
		 c=s.nextInt();
		 bamboos=new int[n];
		for(int i=0;i<n;i++)
			bamboos[i]=s.nextInt();
		System.out.println(syntheticBamboos(0,0,0,0));
	}
	private static long syntheticBamboos(int x, int y, int z, int i) {
		if(i==n) {
			if(x==0 ||y==0 ||z==0)return Integer.MAX_VALUE;
			return Math.abs(x-a)+Math.abs(y-b)+Math.abs(z-c);
		}
		
		long op1=syntheticBamboos(x, y, z, i+1);
		long op2=syntheticBamboos(x+bamboos[i], y, z, i+1)+((x>0)?10:0);
		long op3=syntheticBamboos(x, y+bamboos[i], z, i+1)+ ((y>0)?10:0);
		long op4=syntheticBamboos(x, y, z+bamboos[i], i+1)+ ((z>0)?10:0);
		
		return Math.min(op1, Math.min(op2,Math.min(op3, op4)));
	}
	
}
