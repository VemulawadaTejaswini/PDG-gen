/*Author: Satyajeet Singh, Delhi Technological University*/
import java.io.*;
import java.util.*;
import java.text.*; 
import java.lang.*;

public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static ArrayList<Long> factorial;
    static HashSet<Pair> graph[];

/****************************************Solutions Begins*****************************************/
    static int n,q;
    static Pair input[];
    static String str="";

    static boolean possible1(int mid){
        int c=str.charAt(mid)-'A';
        for(int i=0;i<q;i++){
            if(input[i].u==c){
                mid+=input[i].v;
                if(mid<0){
                    return true;
                }
                if(mid>=n){
                    return false;
                }
                c=str.charAt(mid)-'A';
            }
        }
        return false;
    }
    static boolean possible2(int mid){
        int c=str.charAt(mid)-'A';
        for(int i=0;i<q;i++){
            if(input[i].u==c){
                mid+=input[i].v;
                if(mid<0){
                    return false;
                }
                if(mid>=n){
                    return true;
                }
                c=str.charAt(mid)-'A';
            }
        }
        return false;
    }
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        n=Integer.parseInt(st[0]);
        q=Integer.parseInt(st[1]);
        st=br.readLine().split(" ");
        str=st[0];

        input=new Pair[q];
        for(int i=0;i<q;i++){
            st=br.readLine().split(" ");
            int a=st[0].charAt(0)-'A';
            int k=0;
            if(st[1].charAt(0)=='L'){
                k--;
            }
            else{
                k++;
            }
            input[i]=new Pair(a,k);
        }
       // debug(input);
        int start=0;
        int end=n-1;
        int ans1=-1;
        while(start<=end){
            int mid=(start+end)/2;
           // debug(mid);
            if(possible1(mid)){
                start=mid+1;
                ans1=mid;
            }   
            else{
                end=mid-1;
            }
        }
        start=0;
        end=n-1;
        int ans2=n;
        while(start<=end){
            int mid=(start+end)/2;
           // debug(mid);
            if(possible2(mid)){
                end=mid-1;
                ans2=mid;
            }
            else{
                start=mid+1;
            }
        }
        ans1++;
        ans2--;
        //debug(ans1,ans2);
        out.println(ans2-ans1+1);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }

/****************************************Template Begins************************************************/
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.00000000000000000"); 
        out.println(ft.format(d));
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new HashSet[n];
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
    }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
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
/*************************************************Long Pair*************************************************/
    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            if(p1.v>p2.v){
                return -1;
            }
            else if(p1.v<p2.v){
                return 1;
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
/********************************************End***********************************************************/
}