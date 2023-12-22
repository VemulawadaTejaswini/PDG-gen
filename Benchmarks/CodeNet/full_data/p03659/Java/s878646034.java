import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);	//Wrong answer
		int N = stdIn.nextInt();
		int[] a = new int [N];
		for (int i=0; i < N; i++) {
    		a[i] = stdIn.nextInt();
    	}

		long[] ab = new long [N-1];
		for (int i=0; i < N-1; i++) {
			long x = 0;
			long y = 0;
			for (int j=0; j < i+1; j++) {
				x += a[j];
			}
			for (int j=i+1; j < N; j++) {
				y += a[j];
			}
			ab[i] = Math.abs(x-y);
		}

		long min = ab[0];
		for (int i=1; i < N-1; i++) {
    	    if (ab[i] < min) {
    	    	min = ab[i];
    	    }
    	}
		System.out.println(min);
	}

}
