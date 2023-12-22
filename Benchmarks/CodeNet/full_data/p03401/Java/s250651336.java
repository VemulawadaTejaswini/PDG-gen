import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=0; i<N; i++){
        	A[i] = sc.nextInt();
        }
        A[N] = 0;
        int current = 0;
        int next;
        int total = 0;
    	for(int j=0; j<A.length; j++){
			next = A[j];
			total += Math.abs(current-next);
			current = next;
    	}
    	
    	int diff;
        for(int i=0; i<N; i++){
        	if(i == 0)
        		diff = total - Math.abs(A[i]) - Math.abs(A[i]-A[i+1]) + Math.abs(A[i+1]);
        	else
        		diff = total - Math.abs(A[i]-A[i-1]) - Math.abs(A[i]-A[i+1]) + Math.abs(A[i-1]-A[i+1]);
        	System.out.println(diff);
        }
        
	}

}