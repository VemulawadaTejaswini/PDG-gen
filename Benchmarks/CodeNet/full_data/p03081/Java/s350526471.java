import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		
		int [] a = new int[N];
		char [] b = new char[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = 1;
			b[i]= s.charAt(i);
		}
	
		String t;
		String LR;
		String L ="L";
		int move = 0;
		char tt;
		for (int i = 0; i < Q; i++) {
			t = sc.next();
			LR = sc.next();
			if ( LR.contentEquals(L))
				move = -1;
			else move = 1;		
			tt = t.charAt(0);
			if (b[0] == tt && move == -1)
				a[0] = 0;
			if (b[N-1] == tt && move == 1)
				a[N-1] = 0;
			for (int j = 1; j < N-1; j++) {
			
				if (b[j] == tt) {
					a[j + move] += a[j];
					a[j] = 0;
				}
			}
		}
		int sum = 0;
		for( int i=0; i<N; i++ ) {
            sum += a[i];
		}
		System.out.println(sum);
	}
}