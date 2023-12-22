
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[10000];

		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();
		}
		//System.out.println(N);
		int fn=0;
		for(int i=0; i<N; i++) {
			while(A[i]%2==0) {
				fn++;
				A[i]/=2;

			}
		}
		System.out.println(fn);
	}

}