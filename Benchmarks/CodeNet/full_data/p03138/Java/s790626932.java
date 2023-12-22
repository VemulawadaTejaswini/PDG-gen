import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long K=stdIn.nextLong();
		long A[]=new long[N];
		String a[]=new String[N];
		int z=0,y=0,x=0,min=Long.toBinaryString(K).length();
		long c=1000000000;
		int one[]=new int[Long.toBinaryString(c).length()];
		int zero[]=new int[Long.toBinaryString(c).length()];
		long n=1,m=0;
		while(z<N){
			A[z]=stdIn.nextLong();
			a[z]=Long.toBinaryString(A[z]);
			y=a[z].length();
			while(x<y){
				if(a[z].substring(y-1,y).equals("1"))
					one[x]++;
				else
					zero[x]++;
				y--;x++;
			}
			x=0;
			z++;
		}z=0;x=1;y=0;
		while(z<min){
			if(one[z]>zero[z])
				y=0;
			else
				y=1;
			m+=y*n;
			n*=2;z++;
		}z=0;
		if(m>K)
			m-=n/2;
		n=0;
		while(z<N){
			n+=m^A[z];
			z++;
		}
		System.out.println(n);
	}
}