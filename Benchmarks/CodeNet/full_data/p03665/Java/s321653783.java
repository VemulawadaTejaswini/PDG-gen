import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=gInt();
		int f=gInt(),a[]=new int[2];
		for(int i=0;i<n;++i)
			++a[gInt()%2];
		if(a[1]==0)
			System.out.println(f==0?(long)Math.pow(2,n):0);
		else
			System.out.println((long)Math.pow(2,n-1));
	}
}