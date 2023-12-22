import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long A[]=new long[N];
		long B[]=new long[N];
		int z=0;
		long sum=0,y=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			B[z]=stdIn.nextInt();
			z++;
		}z--;
		while(z>=0) {
			A[z]+=sum;
			while(true) {
				if(A[z]%B[z]==0)
					break;
				y=A[z]/B[z]+1;
				sum+=y*B[z]-A[z];
				A[z]=y*B[z];
			}
			z--;
		}
		System.out.println(sum);
	}
}