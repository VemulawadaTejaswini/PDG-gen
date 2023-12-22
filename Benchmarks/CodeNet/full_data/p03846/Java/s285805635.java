import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	/*static void sort(int[] A,int l,int r) {
		if(l=r) {
			
		}
		sort(A,0,(l+r)/2);
		sort(A,1+ (l+r)/2,r);
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	
		int divnum=(int)Math.pow(10,9)+7;
		
		int N = sc.nextInt();
		int[] A= new int[N];
		int[] B= new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			B[i]=A[i];
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
		//sort(B,0,N-1);
		Arrays.sort(A);
		boolean x=true;
		for(int i=0;i<N;i++) {
			//System.out.println(A[i]+",");
			if(A[i]!=ideal[i]) {
				x=false;
				break;
			}
		}
		if(x) {
			if(N%2==0) {
				System.out.println(((int)Math.pow(2,N/2)%divnum));
			}else {
				System.out.println(((int)Math.pow(2, (N-1)/2)%divnum));
			}
		}else {
			System.out.println(0);
		}
		
	}

}