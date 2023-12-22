import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String s = sc.next();
    	int[] cnt = new int[2];
    	
    	for( int i = 0; i < N; i++ ) {
    		if( s.charAt(i) == 'R' ) {
    			cnt[0]++;
    		}
    		else {
    			cnt[1]++;
    		}
    	}
    	
    	if( cnt[0] > cnt[1] ) {
    		System.out.println( "Yes" );
    	}
    	else {
    		System.out.println( "No" );
    	}
    	
    	sc.close();
    }
}