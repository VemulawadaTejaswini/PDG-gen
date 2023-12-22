/*Author: Satyajeet Singh, Delhi Technological University*/
import java.io.*;
import java.util.*;
import java.text.*; 
import java.lang.*;

public class Main {
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static ArrayList<Long> factorial;
    static HashSet<Integer> graph[];
/****************************************Solutions Begins*****************************************/
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        boolean val[]=new boolean[10];
        st=br.readLine().split(" ");
        for(int i=0;i<m;i++){
            int aa=Integer.parseInt(st[i]);
            val[aa]=true;
        }
        int dig[]={0,2,5,5,4,5,6,3,7,6};
        int dp[][]=new int[n+1][10];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=9;j++){
                dp[i][j]=-1;
            //    int mm=Integer.MAX_VALUE;
                for(int k=1;k<=j;k++){
                    int yy=dig[k];
                    if(val[k]&&yy<=i&&dp[i-yy][k]!=-1){
                        dp[i][j]=k;
                       // mm=yy;
                    }
                }
              //  out.print(dp[i][j]+" ");
            }
           // out.println();
        }
        ArrayList<Integer> nli=new ArrayList<>();
        
        //int i=n;
    for(int j=1;j<=9;j++){
        ArrayList<Integer> li=new ArrayList<>();
        int i=n;
        while(i>0&&dp[i][j]!=-1){
            //out.println(i);
            li.add(dp[i][j]);
            i-=dig[dp[i][j]];
        }
         Collections.sort(li,Collections.reverseOrder());
        // debug(li);
         if(nli.size()<li.size()){
             nli=li;
         }
         else if(nli.size()==li.size()&&li.size()>0){
             int ii=0;
             while(ii<li.size()&&nli.get(ii)==li.get(ii)){
                 ii++;
             }
             if(ii<li.size()&&li.get(ii)>nli.get(ii)){
                 nli=li;
             }
         }
    }
      //  Collections.sort(li,Collections.reverseOrder());
        for(int uu:nli){
            out.print(uu);
        }
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000"); 
        out.println(ft.format(d));
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new HashSet[n];
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }    

/*********************************************PAIR********************************************************/
    static class PairComp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.u>p2.u){
                return 1;
            }
            else if(p1.u<p2.u){
                return -1;
            }
            else{
                return p1.v-p2.v;
            }
        }
    }
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
/*******************************************LONG PAIR****************************************************/
    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            if(p1.u>p2.u){
                return 1;
            }
            else if(p1.u<p2.u){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    static class Pairl implements Comparable<Pair> {
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
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
/*****************************************NUMBER THEORY****************************************************/
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c) {
        long x=1;
        long y=a;
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
    static long gcd(long x, long y)
    {
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
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
/***************************************FACTORIAL*********************************************************/
    static void fact(int n){
        factorial=new ArrayList<>();
        factorial.add((long)1);
        for(int i=1;i<=n;i++){
            factorial.add((factorial.get(i-1)*i)%mod);
        }
    }
/*******************************************ncr*********************************************************/
    static long ncr(int n,int k){
        long aa=modulo(factorial.get(n-k),mod-2,mod);
        long bb=modulo(factorial.get(k),mod-2,mod);
        long cc=factorial.get(n);
        long ans=(aa*cc)%mod;
        ans=(ans*bb)%mod;
        return ans;
    }
/***************************************STRING REVERSE****************************************************/
    static String reverse(String str){
        char r[]=new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            r[j]=str.charAt(i);
            j++;
        }
        return new String(r);
    }
}
/********************************************End***********************************************************/