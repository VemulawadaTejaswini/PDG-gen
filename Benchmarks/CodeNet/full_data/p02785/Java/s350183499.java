import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			Integer H[] = new Integer[N];
			for (int i=0; i<N; i++) {
			  H[i] = sc.nextInt();
			}
	  Arrays.sort(H);
       
	    int sum = 0;
	    if(N <= K) {
	    	System.out.println(0);
	    }else {
	    for(int i=0; i < N -K; i++) {
	    	sum += H[i];
	    }
	        System.out.println(sum);
		}
		}
}