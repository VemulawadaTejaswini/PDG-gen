import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];
    int[] B = new int[N];
    int count = 0;

    for(int i = 0; i < N+1; i++) {
    	A[i] = sc.nextInt();
    }
    for(int i = 0; i < N; i++) {
    	B[i] = sc.nextInt();
    }

    for(int i = N-1; i >= 0; i--) {
    	if(A[i+1] <= B[i]) {
    		B[i] -= A[i+1];
    		count += A[i+1];
    		if(A[i] <= B[i]) {
    			count += A[i];
    			A[i] = 0;
    		} else {
    			A[i] -= B[i];
    			count += B[i];
    		}
    	} else {
    		count += B[i];
    	}
    }
    System.out.println(count);
  }
}