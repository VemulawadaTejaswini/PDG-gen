import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.TreeSet;

public class Main {
    static class Scanner {
        BufferedReader br;
        StringTokenizer tk = new StringTokenizer("");

    public Scanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
    }

    public int nextInt() throws IOException {
        if (tk.hasMoreTokens())
            return Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        return nextInt();
    }

    public long nextLong() throws IOException {
        if (tk.hasMoreTokens())
            return Long.parseLong(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        return nextLong();
    }

    public String next() throws IOException {
        if (tk.hasMoreTokens())
            return (tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        return next();
    }

    public String nextLine() throws IOException {
        tk = new StringTokenizer("");
        return br.readLine();
    }

    public double nextDouble() throws IOException {
        if (tk.hasMoreTokens())
            return Double.parseDouble(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        return nextDouble();
    }

    public char nextChar() throws IOException {
        if (tk.hasMoreTokens())
            return (tk.nextToken().charAt(0));
        tk = new StringTokenizer(br.readLine());
        return nextChar();
    }

    public int[] nextIntArray(int n) throws IOException {
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) throws IOException {
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }

    public int[] nextIntArrayOneBased(int n) throws IOException {
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArrayOneBased(int n) throws IOException {
        long a[] = new long[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = nextLong();
        return a;
    }


}

    public static void main(String args[]) throws IOException {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();

    }

    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        TreeSet<Integer> rd=new TreeSet<>();
        int n=in.nextInt(), m=in.nextInt();
        for(int i=0;i<m;i++)
            rd.add(i);
        ArrayList<Point> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            ar.add(new Point(a,b));
        }
        Collections.sort(ar, (a,b)->a.y>b.y?-1:a.y<b.y?1:a.x>b.x?-1:a.x<b.x?1:0);
        int ans=0;
        for(Point p:ar){
            int tm=m-p.x;
            Integer c=rd.floor(tm);
            if(c!=null){
                ans+=p.y;
                rd.remove(c.intValue());
            }
        }
        out.println(ans);

        out.close();

    }
}
