import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		double A[]=new double[N];
		int z=0;
		while(z<N){
			A[z]=stdIn.nextDouble();
			z++;
		}z=0;
		Arrays.sort(A);
		while(z<N-1){
			A[z+1]=(A[z]+A[z+1])/2;
			z++;
		}
		System.out.println(A[z]);
	}
}