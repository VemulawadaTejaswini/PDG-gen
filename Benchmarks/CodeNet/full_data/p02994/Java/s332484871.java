import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int L=stdIn.nextInt();
		int z=0,sum=0,ans=0,ir=1,x=99999;
		while(z<N){
			sum+=z+L;
			z++;
		}z=0;
		while(z<N){
			if(sum-(sum-z-L)<0)
				ir=-1;
			if((sum-(sum-z-L))*ir<x){
				x=(sum-(sum-z-L))*ir;
				ans=sum-z-L;
			}
			ir=1;
			z++;
		}
		System.out.println(ans);
	}
}