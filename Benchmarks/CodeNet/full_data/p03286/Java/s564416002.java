import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		int ir=1;
		if(N<0)
			ir=-1;
		int a[]=new int[100];
		int ans[]=new int[100];
		String A="";String s="";
		int x=0;
		long pl=0,mi=0,z=1;
		int n=99;
		boolean key=false;
		if(N!=0)
		while(true){
			if(z>0)
				pl+=z;
			if(z<0)
				mi+=z;
			a[x]=z;
			z*=-2;
			if(N<0&&mi<=N){
				N-=a[x];
				ans[x]=1;
				z=1;mi=0;pl=0;x=-1;
			}
			if(N>0&&pl>=N){
				N-=a[x];
				ans[x]=1;
				z=1;mi=0;pl=0;x=-1;
			}
			if(N==0)
				break;
			x++;
		}
		while(n>=0){
			if(ans[n]==1)
				key=true;
			if(key)
				A+=String.valueOf(ans[n]);
			n--;
		}
		if(A.equals(s))
			System.out.println(0);
		else
			System.out.println(A);
	}
}