import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		long A[][]=new long[N][2];
		int z=0,y=0;
		long man=0,cou=0;
		while(z<N){
			A[z][0]=stdIn.nextInt();
			A[z][1]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(A, (a, b) -> Long.compare(a[0], b[0]));
		while(z<N){
			if(cou<M)
				if(M>=A[z][1]+cou){
					cou+=A[z][1];
					man+=A[z][0]*A[z][1];
				}
				else{
					man+=A[z][0]*(M-cou);
					break;
				}
			else
				break;
			z++;
		}
		System.out.println(man);
	}

}