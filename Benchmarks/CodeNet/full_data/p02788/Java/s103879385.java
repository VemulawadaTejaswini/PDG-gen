//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    public static void main(String[] args) throws Exception
    {
        int test = 10,   // 0 for local testing, 1 for std input
            _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}

        new Main().f();
    }

    class SegmentTree
    {
        int from, to;
        int val = 0;
        SegmentTree left = null, right = null;

        public SegmentTree(int from, int to)
        {
            this.from = from;
            this.to = to;
        }

        void update(int from, int to, int val)
        {
            System.out.printf("..%d %d %d %d %d\n", this.from, this.to, from, to, val);
            if(this.to < from || to < this.from) return;
            if(from <= this.from && this.to <= to) {
                this.val += val;
                return;
            }
            int m = (this.from + this.to) >>> 1;
            if(left == null) left = new SegmentTree(this.from, m);
            if(right == null) right = new SegmentTree(m + 1, this.to);
            left.update(from, to, val);
            right.update(from, to, val);
            this.val += val;    //left.val + right.val;
            System.out.printf("update result..%d %d %d\n", this.from, this.to, this.val);
        }

        int get(int idx)
        {
            int r = get0(idx, idx);
            System.out.printf("get..%d %d\n", idx, r);
            return r;
        }

        int get0(int from, int to)
        {
            if(this.to < from || to < this.from) return 0;
            if(from <= this.from && this.to <= to) return val;
            int a = left == null ? 0 : left.get0(from, to),
                b = right == null ? 0 : right.get0(from, to);
            return a + b;
        }
    }

    void f() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            d = Integer.valueOf(sp[1]),
            a = Integer.valueOf(sp[2]);

        int[][] ary = new int[n][2];

        int bound = 0;

        for(int i = 0; i < n; i++) {
            sp = in.readLine().split(" ");
            ary[i][0] = Integer.valueOf(sp[0]);
            ary[i][1] = Integer.valueOf(sp[1]);
            bound = Math.max(bound, ary[i][0]);
        }
        
        Arrays.sort(ary, (u, v)->(u[0] - v[0]));

        // SegmentTree root = new SegmentTree(0, ary[n - 1][0]);   //1_000_000_010);
        Queue<int[]> q = new PriorityQueue<>((u, v)->(u[0] - v[0]));
        long sum = 0;
        long re = 0;
        for(int i = 0; i < n; i++)
        {
            

            // for(int[] qq : q) System.out.println("current q.." + Arrays.toString(qq));
            
            // while(!q.isEmpty() && q.peek()[0] < ary[i][0]) q.poll();
            // long q = root.get(ary[i][0]);
            // System.out.printf("%d %d\n", ary[i][0], q);
            int maxd = ary[i][0] + 2 * d;
            while(!q.isEmpty() && q.peek()[0] <= ary[i][0] ) sum += q.poll()[1];
            // System.out.println("sum = .." + sum);
            ary[i][1] -= sum * a;

            // System.out.printf("current ary.. %s\n", Arrays.toString(ary[i]));
            if(ary[i][1] <= 0) continue;
            // for(int[] elm : ary)
            
            
            int op = ary[i][1] / a;
            if(ary[i][1] % a > 0) op++;
            re += op;
            q.offer(new int[]{ary[i][0], op});
            q.offer(new int[]{maxd + 1, -op});
        }

        System.out.println(re);
    }


    void e() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            n = Integer.valueOf(sp[1]);

        int[] weight = new int[n];
        int[] cost = new int[n];

        int[] f = new int[20010];
        Arrays.fill(f, 1 << 30);
        f[0] = 0;
        for(int i = 0; i < n; i++)
        {
            sp = in.readLine().split(" ");
            int c = Integer.valueOf(sp[0]);
            int w = Integer.valueOf(sp[1]);
            for(int j = c; j <= 20000; j++)
            {
                f[j] = Math.min(f[j], f[j - c] + w);
            }
        }
        // System.out.println(Arrays.toString(f));
        for(int i = 20000; i >= 1; i--)
            f[i] = Math.min(f[i], f[i + 1]);

        // System.out.println(Arrays.toString(f));

        // for(int i = 1; i <= h; i++) 
        //     f[i] = Math.min(f[i], 1 + f[i - 1]);
        
        // System.out.println(Arrays.toString(f));
        System.out.println(f[h]);
    }

    long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    void d() throws Exception
    {
        long h = Long.valueOf(in.readLine());

        // binary heap style
        //
        long count = 1;
        long sum = 0;
        while(h > 0)
        {
            h /= 2;
            sum += count;
            count *= 2;
        }
        System.out.println(sum);
    }
    
    boolean satisfy(int a, int b)
    {
        String s1 = String.valueOf(a),
                s2 = String.valueOf(b);
        int m = s1.length(), n = s2.length();
        if(s1.charAt(0) == s2.charAt(n - 1) && 
            s1.charAt(m - 1) == s2.charAt(0)) return true;
        return false;
    }

    void c() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]);
        int[] ary = new int[n];
        sp = in.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            ary[i] = Integer.valueOf(sp[i]);
        }

        Arrays.sort(ary);
        // use spec on k highest

        long sum = 0;
        for(int i = 0; i < n - k; i++) sum += ary[i];
        
        System.out.println(sum);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            n = Integer.valueOf(sp[1]);
        sp = in.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            h -= Integer.valueOf(sp[i]);
        }
        if(h <= 0) System.out.println("Yes");
        else System.out.println("No");
    }

    void a() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            a = Integer.valueOf(sp[1]);
        int r = 0;
        while(h > 0)
        {
            h -= a;
            r++;
        }
        System.out.println(r);
    }
}