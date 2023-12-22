import java.util.*;
// i hate myself
public class Main{
	public static long cdiv(long a, long b)
	{
		if(a < 0) return 0;
		return (a/b)+(a%b==0 ? 0 : 1);
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        long max_a = -1L;
        for( int i = 0; i < n; i++ ) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
            max_a = Math.max(max_a, a[i]);
        }
        long ct = 0L;
        Arrays.sort(b);
        for( int i = n-1; i >= 0; i-- ) {
            if(b[i] > max_a) {k -= b[i]; ct += 1L;}
            else break;
        }
        ct += cdiv(k,max_a);
        System.out.println(ct);
    }
}