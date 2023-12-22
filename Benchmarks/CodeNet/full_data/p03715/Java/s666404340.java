import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long H = Long.parseLong(sc.next());
	long W = Long.parseLong(sc.next());
	long min = Long.MAX_VALUE;

	long lmin = Long.MAX_VALUE;
	long lmax = Long.MIN_VALUE;

	for(long i = 1; i<H; i++) {
	    // horizon
	    long middle = (H - i)/2;
	    lmin = Math.min(middle, i)*W;
	    lmax = Math.max(H-i-middle, i)*W;
	    min = Math.min(lmax- lmin, min);
	    // vertical
	    middle = W/2;
	    lmin = Math.min(middle*(H-i), i*W);
	    lmax = Math.max((W-middle)*(H-i),i*W);
            min= Math.min(lmax- lmin, min);
	}

	for(long i = 1; i<W; i++) {
            // vertical
	    long middle = (W - i)/2;
            lmin = Math.min(middle, i)*H;
	    lmax = Math.max(W-i-middle,i)*H;
            min= Math.min(lmax- lmin, min);
            // horizon
            middle = H/2;
            lmin = Math.min(middle*(W-i), i*H);
            lmax = Math.max((H-middle)*(W-i),i*H);
            min= Math.min(lmax- lmin, min);
	}

	System.out.println(min);
    }
}