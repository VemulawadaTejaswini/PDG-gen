import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int z=0,sum=0;
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
				A[z]++;sum++;
			}
			z--;
		}
		System.out.println(sum);
	}
}