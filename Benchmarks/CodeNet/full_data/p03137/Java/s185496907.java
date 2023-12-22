import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int max=0;
	static int N;
	static int M;
	static int[] X;
	static int[] Y;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    N = Integer.parseInt(scanner.next());
	    M = Integer.parseInt(scanner.next());
	    X = new int[M];
	    Y= new int[M-1];


	    for (int i=0; i<M; i++) {
	    	X[i] = Integer.parseInt(scanner.next());
	    }
	    Arrays.parallelSort(X);
	    for (int i=0; i<M-1; i++) {
	    	Y[i] = X[i+1] - X[i];
	    }
	    
	    Arrays.parallelSort(Y);
        long a = 0;
	    for (int i=0; i<M-N;i++) {
	    	a+=Y[i];
	    }
	    

	    System.out.println(a);
	}

}