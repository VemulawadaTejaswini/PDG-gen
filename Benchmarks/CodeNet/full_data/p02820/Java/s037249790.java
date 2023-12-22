import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

        int N = in.nextInt();
        int K = in.nextInt();
        int R = in.nextInt();
        int S = in.nextInt();
        int P = in.nextInt();
        char[] T = in.next().toCharArray();

        char r = 'r';
        char s = 's';
        char p = 'p';
        char w = 'w';

        int score = 0;
        for(int i=0; i < N; i++) {
        	if(i >= K) {
        		if (T[i-K] == T[i]) {
        			T[i] = w;
        			continue;
        		}
        	}
        	if (T[i] == r) {
        		score+=P;
        	} else if(T[i] == s) {
        		score+=R;
        	} else if(T[i] == p) {
        		score+=S;
        	}
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