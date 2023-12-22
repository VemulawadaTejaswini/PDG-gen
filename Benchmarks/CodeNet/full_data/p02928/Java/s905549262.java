import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final long K = sc.nextInt();
    		final long K2 = (K * (K-1) / 2) % 1000000007;
    		int[] A = new int[N];
    		for (int i=0; i<N; i++) {
    			A[i] = sc.nextInt();
    		}

    		int count1 = 0;
    		for (int i=0; i<N; i++) {
    			for (int j=i+1; j<N; j++) {
    				if (A[i] > A[j]) {
    					count1++;
    				}
    			}
    		}

    		final int MAX_A = 2001;
    		int[] numCount = new int[MAX_A+1];
    		for (int i=0; i<N; i++) {
    			numCount[A[i]]++;
    		}
    		long totalCount = 0;
    		for (int i=1; i<=MAX_A; i++) {
    			if (numCount[i] != 0) {
        			int lessThan = 0;
        			for (int j=0; j<i; j++) {
        				lessThan += numCount[j];
        			}
        			if (lessThan != 0) {
            			totalCount += lessThan * K2 * numCount[i] ;
            			totalCount %= 1000000007;
        			}
    			}
    		}

    		totalCount += count1 * K;
    		System.out.println(totalCount % 1000000007);

    	} finally {
    		sc.close();
    	}
    }
}

