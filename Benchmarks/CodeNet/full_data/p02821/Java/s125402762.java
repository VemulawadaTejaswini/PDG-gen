import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

        int N = in.nextInt();
        long M = in.nextLong();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
        	A[i] = in.nextInt();
        }
        Arrays.sort(A);

        int dblIdx = A.length -1;
        long score = 0;
        int cnt = 0;
        all: for(int i = A.length -1; i >=0; i--) {
        	for( int j = i-1; j >= 0; j--) {
        		int work = A[i] + A[j];
        		while(dblIdx >=0 && A[dblIdx]*2 > work) {
        			score += A[dblIdx]*2;
        			dblIdx--;
        			if(++cnt == M) break all; 
        		}
        		if(cnt + 1 == M) {
            		score += A[i] + A[j];
            		break all;
        		} else {
            		score += (A[i] + A[j]) * 2;
        			if((cnt+=2) == M) break all; 
        		}
        	}
        }

		while(dblIdx >=0 && cnt != M) {
			score += A[dblIdx]*2;
			dblIdx--;
			++cnt; 
		}

        System.out.println(score);

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}