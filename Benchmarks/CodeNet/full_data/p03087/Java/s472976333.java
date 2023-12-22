import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int Q = sc.nextInt();
    	String S = sc.next();
    	
    	int[] count = new int[N+1];
    	boolean flag = false;
    	for( int i = 0; i < N; i++ ) {
    		if( S.charAt(i) == 'A' ) {
    			flag = true;
    			count[i+1] = count[i];
    		}
    		else if( flag == true && S.charAt(i) == 'C' ) {
    			flag = false;
    			count[i+1] = count[i] + 1;
    		}
    		else {
    			flag = false;
    			count[i+1] = count[i];
    		}
    	}

    	for( int i = 0; i < Q; i++ ) {
    		int l = sc.nextInt();
    		int r = sc.nextInt();
    		System.out.println( count[r] - count[l] );
    	}
    	
    	sc.close();
    }
}