import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long ary[] = new long[k];
		for(int i=0; i<k; i++) {
			ary[i] = sc.nextLong();
		}
		sc.close();
		long l = 2L, r = 2L;
		
		for(int i=k-1; i>=0; i--) {
			l = (long)Math.ceil((double)l/ary[i]) * ary[i];
			r = (long)Math.floor((double)r/ary[i]) * ary[i] + ary[i] - 1;
			if(!exist(l,r,ary[i])) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(l+" "+r);
	}
	
	boolean exist(long l, long r, long a) {
		for(long i=l; i<=r; i++) {
			if(i%a == 0) {
				return true;
			}
		}
		return false;
	}
}