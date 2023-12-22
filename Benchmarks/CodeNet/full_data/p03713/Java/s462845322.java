
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long H = Long.parseLong(scan.next());
	long W = Long.parseLong(scan.next());

	long min = calcMin(H, W);
	if(H != W) {
	    long tmp = calcMin(W, H);
	    min = tmp < min ? tmp : min;
	}
	System.out.println(min);
	scan.close();
    }

    private static long calcMin(long height, long width) {
	long ans = Long.MAX_VALUE;

	if(height >= 3) {
	    if(height%3 == 0) return 0;
	    else ans = width;
	}

	int r1 = (int)height % 3;
	for (int i = 0; i <= r1; i++) {
	    long h1 = height/3 + i;
	    long h2 = height - h1;

	    long w1 = width / 2;
	    long w2 = width - w1;

	    long s1 = h1 * width;
	    long s2 = h2 * w1;
	    long s3 = h2 * w2;
	    
	    long tmp = difference(s1, s2, s3);
	    ans = tmp < ans ? tmp : ans;
	}
	return ans;
    }

    private static long difference(long a, long b, long c) {
	if(a<b) {
	    if(b<c) return c-a;
	    else {
		if(a<c) return b-a;
		else return b-c;
	    }
	} else {
	    if(a<c) return c-b;
	    else {
		if(b<c) return a-b;
		else return a-c;
	    }
	}
    }
}    
