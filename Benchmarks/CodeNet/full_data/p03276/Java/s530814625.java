import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		long mi=0,pl=0,min=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=1;
		if(A[0]<0)
			mi=A[0]*-1;
		if(A[K-1]>0)
			pl=A[K-1];
		if(mi<=pl)
			min=mi*2+pl;
		else
			min=pl*2+mi;
		K--;
		while(z<N-K){
			if(A[z]<0)
				mi=A[z]*-1;
			else
				mi=0;
			if(A[z+K]>0)
				pl=A[z+K];
			else
				pl=0;
			long a=0;
			if(mi<=pl)
				a=mi*2+pl;
			else
				a=pl*2+mi;
			if(a<min)
				min=a;
			z++;
		}
		System.out.println(min);
	}
}