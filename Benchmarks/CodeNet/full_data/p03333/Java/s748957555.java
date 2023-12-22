import java.io.*;
import java.math.BigDecimal;
import java.net.Inet4Address;
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

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Pair[]a= new Pair[n];
        Pair[]b= new Pair[n];
        for (int i =0;i<n;i++){
            a[i]= new Pair(sc.nextInt(),sc.nextInt(),i);
            b[i]= new Pair(a[i].l,a[i].r,i);
        }
        Arrays.sort(a,(x,y)->x.l==y.l?y.r-x.r:y.l-x.l);
        Arrays.sort(b,(x,y)->x.r==y.r?x.l-y.l:x.r-y.r);
        TreeSet<Integer>ids= new TreeSet<>();
        int id1=0;
        int id2=0;
        int cur=0;
        long ans=0;
        boolean pre=true;
        while (true){
            int d1=0;
            int d2=0;
            if (id1<n&&cur<a[id1].l){
                d1=a[id1].l-cur;
            }
            if (id2<n&&cur>b[id2].r){
                d2=cur-b[id2].r;
            }
            if (d1==d2&&d1==0)break;
            if (pre){
                ans+=d1;
                ids.add(a[id1].idx);
                id1++;
                cur+=d1;
            }else {
                ans+=d2;
                ids.add(b[id2].idx);
                id2++;
                cur-=d2;
            }
            pre=!pre;
            while (id1<n&&ids.contains(a[id1].idx))id1++;
            while (id2<n&&ids.contains(b[id2].idx))id2++;
        }
        long sol= ans+Math.abs(cur);
        ans=id1=id2=cur=0;
        ids.clear();
        pre=false;
        while (true){
            int d1=0;
            int d2=0;
            if (id1<n&&cur<a[id1].l){
                d1=a[id1].l-cur;
            }
            if (id2<n&&cur>b[id2].r){
                d2=cur-b[id2].r;
            }
            if (d1==d2&&d1==0)break;
            if (pre){
                ans+=d1;
                ids.add(a[id1].idx);
                id1++;
                cur+=d1;
            }else {
                ans+=d2;
                ids.add(b[id2].idx);
                id2++;
                cur-=d2;
            }
            pre=!pre;
            while (id1<n&&ids.contains(a[id1].idx))id1++;
            while (id2<n&&ids.contains(b[id2].idx))id2++;
        }
        sol=Math.max(sol,ans+Math.abs(cur));
        pw.println(sol);
        pw.flush();
    }
    static class Pair{
        int l,r,idx;
        Pair(int a,int b,int id){
            l=a;
            r=b;
            idx=id;
        }
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