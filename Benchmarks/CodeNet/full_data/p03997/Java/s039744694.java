import java.math.BigInteger;
import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static long h,w,n;
    static Hashtable<Long, Long> hashtable = new Hashtable<Long, Long>();
    static long dx[] = new long[]{-2, -2, -2, -1, -1, -1, 0, 0, 0};
    static long dy[] = new long[]{-2, -1, 0, -2, -1, 0, -2, -1, 0};

    static void add(long x, long y) {
        long a, b;
        long tmp;
        for (int i = 0; i < 9; ++i) {
            a = x + dx[i];
            b = y + dy[i];
            if(a<1||b<1||a>h-2||b>w-2) {
                continue;
            }
            tmp = (h-2) * ( b - 1) + a;
            Object ans = hashtable.get(tmp);
            if(ans == null) {
                hashtable.put(tmp, 1L);
            }
            else {
                hashtable.put(tmp,((long)ans)+1);
            }
        }
    }

    public static void main(String args[]){
        h = in.nextLong();
        w = in.nextLong();
        n = in.nextLong();
        for (long i = 0; i < n; ++i) {
            long x, y;
            x = in.nextLong();
            y = in.nextLong();
            add(x,y);
        }
        long ans[] = new long[10];
        Arrays.fill(ans,0);
        ans[0] = (h-3)*(w-2)+w-2;
        Set<Long>s = hashtable.keySet();
        for (Long nxt : s) {
            long second = hashtable.get(nxt);
            ans[(int) second]++;
            ans[0]--;
        }
        for(int i = 0;i<10;++i) {
            System.out.println(ans[i]);
        }
    }
}