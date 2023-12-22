import java.util.*;
import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A= new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		int[] ideal =new int[N];
		if(N%2==0) {
			for(int i=0;i<N;i++) {
				ideal[i]=(i/2)*2 +1;
			}
		}else{
			for(int i=0;i<N;i++) {
				ideal[i]=((i+1)/2)*2;
			}
		}
		
		//sort A[i]
		for(int i=0;i<N;i++) {
			for(int j=N-1;j>i;j--) {
				if(A[j]<A[j-1]) {
					int c=A[j-1];
					A[j-1]=A[j];
					A[j]=c;
				}
			}
		}
		boolean x=true;
		for(int i=0;i<N;i++) {
			if(A[i]!=ideal[i]) {
				x=false;
				break;
			}
		}
		if(x) {
			if(N%2==0) {
				System.out.println((int)Math.pow(2,N/2));
			}else {
				System.out.println((int)Math.pow(2, (N-1)/2));
			}
		}else {
			System.out.println(0);
		}
		
	}

}
