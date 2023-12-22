import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    long[] input = new long[5];
	    long N = sc.nextLong();
	    for(int i = 0; i < input.length; i++) {
	    	input[i] = sc.nextLong();
	    }
	    long minTransCapa = Long.MAX_VALUE;
	    for( int i = 0; i < input.length; i++) {
	    	if( input[i] <= minTransCapa ) {
	    		minTransCapa = input[i];
	    	}
	    	
	    }
	    long total = 0;
	    if( N%minTransCapa == 0 ) {
	    	total = 5 + N/minTransCapa - 1;
	    } else {
	    	total = 5 + N/minTransCapa;
	    }
	    
	    
    	System.out.println(total);

		sc.close();
	}
}
