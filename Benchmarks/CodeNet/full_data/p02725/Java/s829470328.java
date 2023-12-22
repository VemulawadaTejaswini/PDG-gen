import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int X = 0;
		int Y = 0;
		X = A[N-1]-A[0];
        if(A[0]!=0){
		Y = A[0]+(K-A[N-1]);
        }else if(A[0]==0){
        Y = A[1]+(K-A[N-1]);
        }
		System.out.print(Math.min(X,Y));
	}
}