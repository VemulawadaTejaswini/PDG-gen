import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long L=stdIn.nextLong();
		long R=stdIn.nextLong();
		long A[]=new long[2019];
		long min=2019,z=L,y=0;
		int x=0,w=0,v=0;
		while(z<=R){
			if(z==L)
				y=z%2019;
			if(z!=L&&z%2019==y)
				break;
			A[x]=z%2019;
			x++;
			z++;
		}z=L;
		while(w<x){
			v=w+1;
			while(v<x){
				long c=(A[w]*A[v])%2019;
				if(c<min)
					min=c;
				v++;
			}
			w++;
		}
		System.out.println(min);
	}
}