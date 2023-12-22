import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.lang.management.MemoryType;
import java.math.BigInteger;
import java.util.*;


public class Main {
    static final int INF = Integer.MAX_VALUE;

    static int mergeSort(int[] a,int [] c, int begin, int end)
    {
        int inversion=0;
        if(begin < end)
        {
            inversion=0;
            int mid = (begin + end) >>1;
            inversion+= mergeSort(a,c, begin, mid);
            inversion+=mergeSort(a, c,mid + 1, end);
            inversion+=merge(a,c, begin, mid, end);
        }
        return inversion;
    }


    static int  merge(int[] a,int[]c, int b, int mid, int e)
    {
        int n1 = mid - b + 1;
        int n2 = e - mid;
        int[] L = new int[n1+1], R = new int[n2+1];
        int[] L1 = new int[n1+1], R1 = new int[n2+1];
        //inversion
        int inversion=0;

        for(int i = 0; i < n1; i++) {
            L[i] = a[b + i];
            L1[i] = c[b + i];
        }
        for(int i = 0; i < n2; i++)  {
            R[i] = a[mid + 1 + i];
            R1[i] = c[mid + 1 + i];
        }
        L[n1] = R[n2] = INF;

        for(int k = b, i = 0, j = 0; k <= e; k++)
            if(L[i] <= R[j]){
                a[k] = L[i];
                c[k] = L1[i++];
            }

            else
            {
                a[k] = R[j];
                c[k] = R1[j++];
                inversion=inversion+(n1-i);

            }
        return inversion;

    }

    static int []c;
    static int[] v;
    static int []mem;
    static int dp(int i,int cc,int vv){
        if (i>=c.length)return 0;
        if (mem[i]!=-1)return mem[i];
        int ans=0;
        ans+=Math.max(dp(i+1,cc+c[i],vv+v[i])+((cc+c[i])-(vv+v[i])),dp(i+1,cc,vv));
        return mem[i]=ans;
    }

        public static void main (String[]args) throws IOException {
        Scanner in = new Scanner(System.in);
        try(PrintWriter or = new PrintWriter(System.out)){

            int n = in.nextInt();
          c=new int[n];
          v=new int[n];

            for (int i = 0; i < n; i++) {
                c[i]=in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                v[i]=in.nextInt();
            }

           int ans=0;
            mergeSort(c,v,0,n-1);
            for (int i = n-1; i >=0 ; i--) {
                if (c[i]>v[i])ans+=(c[i]-v[i]);
            }
            or.println(ans);




        }


    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
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
            for (int i = start; i < x.length(); i++) {
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec) {
                        f *= 10;
                    }
                }
            }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}

class prog {

    int skill;
    int indx;
    int pp;

    public prog(int skill, int indx) {
        this.skill = skill;
        this.indx = indx;
        pp = 0;
    }

    @Override
    public String toString() {
        return "prog{" + "skill=" + skill + ", indx=" + indx + ", pp=" + pp + '}';
    }

}