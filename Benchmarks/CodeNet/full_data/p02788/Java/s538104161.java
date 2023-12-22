import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
public class Main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class SegmentTree {        // 1-based DS, OOP

        int N;            //the number of elements in the array as a power of 2 (i.e. after padding)
        long[] array, sTree, lazy;

        SegmentTree(long[] in) {
            array = in;
            N = in.length - 1;
            sTree = new long[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
            lazy = new long[N << 1];
            build(1, 1, N);
        }

        void build(int node, int b, int e)    // O(n)
        {
            if (b == e)
                sTree[node] = array[b];
            else {
                int mid = b + e >> 1;
                build(node << 1, b, mid);
                build(node << 1 | 1, mid + 1, e);
                sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
            }
        }




        void update_range(int i, int j, long val)        // O(log n)
        {
            update_range(1, 1, N, i, j, val);
        }

        void update_range(int node, int b, int e, int i, int j, long val) {
            if (i > e || j < b)
                return;
            if (b >= i && e <= j) {
                sTree[node] += (e - b + 1) * val;
                lazy[node] += val;
            } else {
                int mid = b + e >> 1;
                propagate(node, b, mid, e);
                update_range(node << 1, b, mid, i, j, val);
                update_range(node << 1 | 1, mid + 1, e, i, j, val);
                sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
            }
        }

        void propagate(int node, int b, int mid, int e) {
            lazy[node << 1] += lazy[node];
            lazy[node << 1 | 1] += lazy[node];
            sTree[node << 1] += (mid - b + 1) * lazy[node];
            sTree[node << 1 | 1] += (e - mid) * lazy[node];
            lazy[node] = 0;
        }

        long query(int i, int j) {
            return query(1, 1, N, i, j);
        }

        long query(int node, int b, int e, int i, int j)    // O(log n)
        {
            if (i > e || j < b)
                return 0;
            if (b >= i && e <= j)
                return sTree[node];
            int mid = b + e >> 1;
            propagate(node, b, mid, e);
            long q1 = query(node << 1, b, mid, i, j);
            long q2 = query(node << 1 | 1, mid + 1, e, i, j);
            return q1 + q2;

        }

    }
    static Pair []aa ;
    static class Pair{
        int x,h;
        Pair(int a,int b){
            x=a;
            h=b;
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();
        aa= new Pair[n];
        TreeSet<Integer>ts = new TreeSet<>();
        for (int i =0;i<n;i++){
            aa[i]=new Pair(sc.nextInt(),sc.nextInt());
            ts.add(aa[i].x);
        }
        TreeMap<Integer,Integer>comp= new TreeMap<>();
        int id=1;
        while (!ts.isEmpty())comp.put(ts.pollFirst(),id++);
        int N = 1; while(N < n) N <<= 1; //padding
        long []in= new long[N+1];
        for (int i =0;i<n;i++){
            in[comp.get(aa[i].x)]=aa[i].h;
        }
        Arrays.sort(aa,(xx,yy)->xx.x-yy.x);
        SegmentTree sg = new SegmentTree(in);
        long ans=0;
        for (int i =0;i<n;i++){
            long z = sg.query(i+1,i+1);
            if (z<=0)continue;
            long add= (z+a-1)/a;
            ans+=add;
            long xx= aa[i].x+2l*d;
            if (xx<=1e9)
            sg.update_range(i+1,comp.get(comp.floorKey((int)xx)),-1l*add*a);
            else {
                sg.update_range(i+1,n,-1l*add*a);
            }
        }
        pw.println(ans);
        pw.flush();
    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}