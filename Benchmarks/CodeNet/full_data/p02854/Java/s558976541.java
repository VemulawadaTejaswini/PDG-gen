import java.util.Scanner;

public class Main {
  
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

	    int N = sc.nextInt();
	    int A[] = new int[N];
	    
	    long sum = 0;
	    
	    for(int i=0; i<N; i++) {
	    	A[i] = sc.nextInt();
	    	sum += A[i];
	    }
	    
	    long min = Long.MAX_VALUE;
	    long temp = 0;
	    for (int i=0; i<N; i++) {
	    	temp += A[i];
	    	if (Math.abs(sum - 2*temp)<min) {
	    		min = Math.abs(sum - 2*temp);
	    	}
	    }
	    
	    System.out.println(min);
	}

}

    
    