import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    long[] H  = new long[N];
	    
	    for (int i=0; i<N; i++) {
	        H[i]= Long.parseLong(scanner.next());
	    }

	    int m= 0;
	    int tmp=0;
        for (int i=0; i<N-1; i++) {
	        if (H[i] >= H[i+1]) {
	        	tmp++;
	        	if (m < tmp) {
	        		m=tmp;
	        	}
	        }else {
	        	tmp=0;
	        }
	    }

        System.out.print(m);
	}

}