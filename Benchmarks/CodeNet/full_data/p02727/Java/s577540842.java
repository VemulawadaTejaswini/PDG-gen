/*****Author: Satyajeet Singh, Delhi Technological University************************************/
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
    static ArrayList<Integer> graph[];
    static int pptr=0;
    static String st[];
/*****************************************Solutions Begins***************************************/
    public static void main(String args[]) throws Exception{
        nl();
        int x=pi();
        int y=pi();
        int a=pi();
        int b=pi();
        int c=pi();
        Long A[]=new Long[a];
        Long B[]=new Long[b];
        Long C[]=new Long[c];
        nl();
        for(int i=0;i<a;i++){
            A[i]=pl();
        }
        nl();
        for(int i=0;i<b;i++){
            B[i]=pl();
        }
        nl();
        for(int i=0;i<c;i++){
            C[i]=pl();
        }
        Arrays.sort(A,Collections.reverseOrder());
        Arrays.sort(B,Collections.reverseOrder());
        Arrays.sort(C,Collections.reverseOrder());
        long prefA[]=new long[a+1];
        long prefB[]=new long[b+1];
        long prefC[]=new long[c+1];
        for(int i=1;i<=a;i++){
            prefA[i]=prefA[i-1]+A[i-1];
        }
        for(int i=1;i<=b;i++){
            prefB[i]=prefB[i-1]+B[i-1];
        }
        for(int i=1;i<=c;i++){
            prefC[i]=prefC[i-1]+C[i-1];
        }
        long ans=0;
        for(int i=0;i<=x;i++){
            int start=0;
            int end=y;
            long max=0;
            while(start<=end){
                int mid=(start+end)/2;  
                int r=x+y-i-mid;
                long c1=Long.MIN_VALUE;
                if(r<=c)
                    c1=prefB[mid]+prefC[r];
                max=Math.max(max,c1);

                if(mid+1>y)break;
                
                r=x+y-i-mid-1;
                long c2=Long.MIN_VALUE;
                if(r<=c)
                    c2=prefB[mid+1]+prefC[r];
                max=Math.max(max,c2);

                //debug(i,mid,c1,c2,max);

                if(c1<=c2)
                    start=mid+1;
                else
                    end=mid-1;
            }
            //debug(i,ans,max,prefA[i]);

            ans=Math.max(ans,max+prefA[i]);
            // for(int j=0;j<=y;j++){
            //     int r=x+y-i-j;
            //     if(r>c)continue;
            //     ans=Math.max(ans,prefA[i]+prefB[j]+prefC[r]);
            // }
        }
        out.println(ans);
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
        DecimalFormat ft = new DecimalFormat("0.000000000000"); 
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
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
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
            if(b%2 == 1)
                x=(x*y)%c;
            y = (y*y)%c;
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
        a = (x > y) ? x : y; 
        b = (x < y) ? x : y;
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

/********************************************End***********************************************************/
}