import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	long K = Long.parseLong(sc.next());
	long xor = 0;
	long maxdigit = 0;
	long[] a = new long[N];
	for(int i = 0; i<N; i++) {
	    a[i] = Long.parseLong(sc.next());
	    maxdigit = Math.max(maxdigit, (long)(Math.log(a[i])/Math.log(2)+1));
	    xor = xor ^ a[i];
	}
	K = K>>maxdigit;
	K = K<<maxdigit;
	xor = xor | K;
	long ans = 0;
	for(int i = 0; i<N; i++) {
	    ans += xor ^ a[i];
	}
	System.out.println(ans);

    }
}