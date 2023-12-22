//Build Stairs
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    String anser="Yes";

        Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int[] H = new int[N];
	    for(int i=0; i<N; i++) {
	    	H[i] = s.nextInt();
	    }
	    for(int i=0; i<N-1; i++) {
	    	if(H[i]-H[i+1] > 1) {
	    		anser = "No";
	    		break;
	    	}
	    }

		System.out.println(anser);
	}
}
