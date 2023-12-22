import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int Q = sc.nextInt();
    	long[] s = new long[A];
    	for( int i = 0; i < A; i++ ){
    		s[i] = sc.nextLong();
    	}
    	long[] t = new long[B];
    	for( int i = 0; i < B; i++ ){
    		t[i] = sc.nextLong();
    	}
    	for( int i = 0; i < Q; i++ ){
    		long x = sc.nextLong();
    		
    		long min1 = 0;
    		long cur = x;
    		int r = Arrays.binarySearch(s, cur);
    		r = (r + 1) * -1;
    		
    		if( r == A ){
    			min1 += cur - s[r-1];
				cur = s[r-1];
    		}
    		else if( r == 0 ){
    			min1 += s[r] - cur;
				cur = s[r];
    		}
    		else if( cur - s[r-1] < s[r] - cur ){
				min1 += cur - s[r-1];
				cur = s[r-1];
			}
			else{
				min1 += s[r] - cur;
				cur = s[r];
			}
    		r = Arrays.binarySearch(t, cur);
    		r = (r + 1) * -1;
    		if( r == B ){
    			min1 += cur - t[r-1];
				cur = t[r-1];
    		}
    		else if( r == 0 ){
    			min1 += t[r] - cur;
				cur = t[r];
    		}
    		else if( cur - t[r-1] < t[r] - cur ){
				min1 += cur - t[r-1];
				cur = t[r-1];
			}
			else{
				min1 += t[r] - cur;
				cur = t[r];
			}
    		
    		//
    		long min2 = 0;
    		cur = x;
    		r = Arrays.binarySearch(t, cur);
    		r = (r + 1) * -1;
    		if( r == B ){
    			min2 += cur - t[r-1];
				cur = t[r-1];
    		}
    		else if( r == 0 ){
    			min2 += t[r] - cur;
				cur = t[r];
    		}
    		else if( cur - t[r-1] < t[r] - cur ){
				min2 += cur - t[r-1];
				cur = t[r-1];
			}
			else{
				min2 += t[r] - cur;
				cur = t[r];
			}
    		
    		
    		r = Arrays.binarySearch(s, cur);
    		r = (r + 1) * -1;
    		if( r == A ){
    			min2 += cur - s[r-1];
				cur = s[r-1];
    		}
    		else if( r == 0 ){
    			min2 += s[r] - cur;
				cur = s[r];
    		}
    		else if( cur - s[r-1] < s[r] - cur ){
				min2 += cur - s[r-1];
				cur = s[r-1];
			}
			else{
				min2 += s[r] - cur;
				cur = s[r];
			}
    		System.out.println( Math.min(min1, min2) );
    	}
    	
    	sc.close();
    }
} 