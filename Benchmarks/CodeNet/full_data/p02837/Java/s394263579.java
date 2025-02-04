import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.io.*;
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

public class Main {
    static class Arr implements Comparable<Arr>{
        int[]a;
        Arr(int[]x){
            a=x;
        }
        @Override
        public int compareTo(Arr arr) {
            for (int i =0;i<4;i++){
                if (a[i]!=arr.a[i])return a[i]-arr.a[i];
            }
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[][]a=new int[n][2];
        for (int i =0;i<n;i++){
            int c = sc.nextInt();
            int h =0;
            int u=0;
            while (c-->0){
                int p = sc.nextInt();
                if (sc.nextInt()==1){
                    h|=1<<(p-1);
                }
                else {
                    u|=1<<(p-1);
                }
            }
            a[i][0]=h;
            a[i][1]=u;
        }
        int ans=0;
        for (int i =1;i<(1<<n);i++){
            int m = i;
            int m2=0;
            for (int k=0;k<n;k++){
                for (int z =0;z<n;z++){
                    if ((m&1<<z)!=0){
                        m|=a[z][0];
                        m2|=a[z][1];
                    }
                }
            }
            boolean is =true;
            for (int k=0;k<n;k++){
                if ((m&1<<k)!=0&&(m2&1<<k)!=0)is=false;
            }
            if (is){
                ans=Math.max(ans,Integer.bitCount(m));
            }
        }
        pw.println(ans);
        pw.flush();
    }
    static class UnionFind {
        int[] p, rank, setSize;
        int numSets;
        HashSet<Integer>[]ele;
        public UnionFind(int N)
        {
            ele=new HashSet[N];
            p = new int[numSets = N];
            rank = new int[N];
            setSize = new int[N];
            for (int i = 0; i < N; i++) {
                ele[i]=new HashSet<>();
                p[i] = i; setSize[i] = 1;
                ele[i].add(i);
            }
        }

        public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

        public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

        public void unionSet(int i, int j)
        {
            if (isSameSet(i, j))
                return;
            numSets--;
            int x = findSet(i), y = findSet(j);
            if(rank[x] > rank[y]) {
                for (int zz:ele[y])ele[x].add(zz);
                p[y] = x; setSize[x] += setSize[y]; }
            else
            {	for (int zz:ele[x])ele[y].add(zz);
                p[x] = y; setSize[y] += setSize[x];
                if(rank[x] == rank[y]) rank[y]++;
            }
        }

        public int numDisjointSets() { return numSets; }

        public int sizeOfSet(int i) { return setSize[findSet(i)]; }
    }
    static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
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