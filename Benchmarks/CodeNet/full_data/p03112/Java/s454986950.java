import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long s[] = new long[A];
		long t[] = new long[B];
		long x[] = new long[Q];
		
		for(int i = 0; i < A; i++) {
			s[i] = sc.nextLong();
		}
		for(int i = 0; i < B; i++) {
			t[i] = sc.nextLong();
		}
		
		for(int i = 0; i < Q; i++) {
			x[i] = sc.nextLong();
			int su = lowerbound(s, x[i]);
			if(su >= A) su = A - 1;
			int sd = Math.max(su - 1, 0);
			int tu = lowerbound(t, x[i]);
			if(tu >= B) tu = B - 1;
			int td = Math.max(tu - 1, 0);
			long min = Long.MAX_VALUE;
			min = Math.min(min, Math.abs(x[i] - s[sd]) + Math.abs(s[sd] - t[td]));
			min = Math.min(min, Math.abs(x[i] - s[sd]) + Math.abs(s[sd] - t[tu]));
			min = Math.min(min, Math.abs(s[su] - x[i]) + Math.abs(s[su] - t[td]));
			min = Math.min(min, Math.abs(s[su] - x[i]) + Math.abs(s[su] - t[tu]));
			min = Math.min(min, Math.abs(x[i] - t[td]) + Math.abs(t[td] - s[sd]));
			min = Math.min(min, Math.abs(x[i] - t[td]) + Math.abs(t[td] - s[su]));
			min = Math.min(min, Math.abs(t[tu] - x[i]) + Math.abs(t[tu] - s[sd]));
			min = Math.min(min, Math.abs(t[tu] - x[i]) + Math.abs(t[tu] - s[su]));
			System.out.println(min);
		}
	}
	
public static int upperbound(long[] a, long v){ return upperbound(a, 0, a.length, v + 1); }
    public static int upperbound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] >= v){
                high = h;
            }else{
                low = h;
            }
        }
        return low;
    }
    
public static int lowerbound(long[] a, long v){ return lowerbound(a, 0, a.length, v - 1); }
    public static int lowerbound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] <= v){
                low = h;
            }else{
                high = h;
            }
        }
        return high;
    }
}
