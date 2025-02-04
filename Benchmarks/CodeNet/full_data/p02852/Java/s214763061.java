/*Author: Satyajeet Singh, Delhi Technological University*/
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static long factorial[],invFactorial[];
    static ArrayList<Pair> graph[];
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    static class segmentTree{
        int n=0;
        int[] lo,hi;
        long[] value,delta;
        int idx[];
        segmentTree(int n){
            this.n=n;
            lo=new int[8*n+1];
            hi=new int[8*n+1];
            value=new long[8*n+1];
            delta=new long[8*n+1];
            idx=new int[8*n+1];
            init(1,1,n);
        } 
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                idx[i]=left;
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
        }
        void update(int left,int right,long val){
            update(1,left,right,val);
        }
        Pairl query(int left,int right){
            return query(1,left,right);
        }
        void prop(int i){
            delta[2*i]+=delta[i];
            delta[2*i+1]+=delta[i];
            delta[i]=0;
        }
        void update(int i){
            long a=value[2*i]+delta[2*i];
            long b=value[2*i+1]+delta[2*i+1];
            if(a<=b){
                value[i]=a;
                idx[i]=idx[2*i];
            }
            else{
                value[i]=b;
                idx[i]=idx[2*i+1];
            }
        }
        void update(int i,int left,int right,long val){
            if(left>hi[i]||right<lo[i]){
                return;
            }
            if(lo[i]>=left&&hi[i]<=right){
                delta[i]+=val;
                value[i]+=delta[i];
                if(left==right){
                    delta[i]=0;
                    idx[i]=left;
                    return;
                }
                prop(i);
                return;
            }
            prop(i);
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            update(i);
        }
        Pairl query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return null;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return new Pairl(value[i]+delta[i],idx[i]);
            }
            prop(i);
            Pairl l=query(2*i,left,right);
            Pairl r=query(2*i+1,left,right);
            update(i);
            if(l==null)return r;
            if(r==null)return l;
            if(l.u<=r.u){
                return l;
            }
            else{
                return r;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        nl();
        int n=pi();
        int m=pi();
        nls();
        boolean input[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            int a=pi();
            if(a==0)input[i]=true;
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE>>2);
        segmentTree seg=new segmentTree(n);
        seg.update(n,n,0);
        dp[n]=0;
        int ans[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            // int max=Integer.MAX_VALUE>>2;
            // int mm=0;
            // for(int j=1;j<=m;j++){
            //     int idx=i+j;
            //     if(idx<=n){
            //         if(max>dp[idx]){
            //             max=dp[idx];
            //             mm=j;
            //         }
            //     }
            // }
            if(input[i]){
                Pairl p=seg.query(i+1,Math.min(n,i+m));
                //debug(i,p);
                dp[i]=(int)p.u+1;
                ans[i]=(int)p.v-i;
            }
            seg.update(i,i,dp[i]);
        }
        // debug(dp);
        // debug(ans);

        if(dp[0]>=Integer.MAX_VALUE>>2)out.println(-1);
        else{
            int u=0;
            while(dp[u]!=0){
                out.print(ans[u]+" ");
                u+=ans[u];
            }
        }
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
    }
    static int pi(){
        return Integer.parseInt(st[pptr++]);
    }
    static long pl(){
        return Long.parseLong(st[pptr++]);
    }
    static double pd(){
        return Double.parseDouble(st[pptr++]);
    }
    static String ps(){
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000000000000"); 
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(long mask){
        int ans=0;
        while(mask!=0){
            mask&=(mask-1);
            ans++;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(new Pair(b,1));
    }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
    }    
/*********************************************PAIR********************************************************/
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int index=-1;
        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
        public int compareTo(Pair other) {
            if(index!=other.index)
                return Long.compare(index, other.index);
            return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*******************************************************/
    static class Pairl implements Comparable<Pairl> {
            long u;
            long v;
            int index=-1;
            public Pairl(long u, long v) {
                this.u = u;
                this.v = v;
            }
            public int hashCode() {
                int hu = (int) (u ^ (u >>> 32));
                int hv = (int) (v ^ (v >>> 32));
                return 31 * hu + hv;
            }
            public boolean equals(Object o) {
                Pairl other = (Pairl) o;
                return u == other.u && v == other.v;
            }
            public int compareTo(Pairl other) {
                if(index!=other.index)
                    return Long.compare(index, other.index);
                return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
            }
            public String toString() {
                return "[u=" + u + ", v=" + v + "]";
            }
        }
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c){
        long x=1;
        long y=a%c;
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y*y)%c; // squaring the base
            b /= 2;
        }
        return  x%c;
    }
/********************************************GCD**********************************************************/
    static long gcd(long x, long y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
/******************************************SIEVE**********************************************************/
    static void sieveMake(int n){
        sieve=new boolean[n];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i*i<n;i++){
            if(sieve[i]){
                for(int j=i*i;j<n;j+=i){
                    sieve[j]=false;
                }
            }
        }
        primes=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(sieve[i]){
                primes.add(i);
            }
        }        
    }
/********************************************End***********************************************************/
}