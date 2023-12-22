import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N-1];
		int sum=0;

		for(int i=0; i<N-1; i++){
			B[i] = sc.nextInt();
		}
		A[0] = B[0];
		sum += A[0];
		for(int i=1; i<N-1; i++){
			A[i] = Math.min(B[i-1],B[i]);
			sum += A[i];
		}
		A[N-1] = Math.max(A[N-2], B[N-2]);
		sum += A[N-1];

        System.out.println(sum);
		//System.out.println(Arrays.toString(A));
    }
}