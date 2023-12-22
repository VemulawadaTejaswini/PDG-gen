import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
	long K = sc.nextLong();
	long[] a = new long[(int)(N)];
	long amax = 0;
	for(int i = 0; i<N; i++) {
	    a[i] = sc.nextLong();
	    amax = Math.max(amax, a[i]);
	}
	long adigit = 0;
	long ac = amax;
	while(ac != 0) {
	    ac = ac/2;
	    adigit++;
	}
	long kdigit = 0;
	long k = K;
	while(k != 0) {
	    k = k/2;
	    kdigit++;
	}
	long ans = 0;
	for(int i = 0; i<adigit || i< kdigit; i++) {
	    long candidate = 0;
	    for(int j = 0; j<N; j++) {
		candidate += a[j]%2;
		a[j] = a[j]/2;
	    }
	    if (i<kdigit) candidate = Math.max(candidate,(N - candidate));
	    ans += candidate*(long)(Math.pow(2,i));
	}
	System.out.println(ans);
    }
}