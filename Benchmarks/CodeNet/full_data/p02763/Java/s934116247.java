import java.io.*; 
import java.util.*; 
//import javafx.util.*; 
import java.math.*;
//import java.lang.*;
public class Main 
{ 
    
    // static int n;
    // static int n;
    // static int parent[];
    // static int size[];
    // static long ans[];
    // static int arr[];
    static HashSet<Integer> adj[];
    static boolean vis[];
    static long mod=1000000007;
    static final long oo=(long)1e18;
    static HashSet<Character> seg[];
    public static void main(String[] args) throws IOException { 
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        br = new BufferedReader(new InputStreamReader(System.in));
        //int test=nextInt();
        int test=1;
        outer:while(test-->0){
            int n=nextInt();
            String s=next();
            int q=nextInt();
            char arr[]=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i);
            }
            seg=new HashSet[4*n];
            for(int i=0;i<4*n;i++){
                seg[i]=new HashSet<>();
            }
            build(arr,1,0,n-1);
            for(int i=0;i<q;i++){
                int t=nextInt();
                if(t==1){
                    int idx=nextInt()-1;
                    char val=next().charAt(0);
                    update(arr,1,0,n-1,idx,val);
                    arr[idx]=val;
                }
                else{
                    int l=nextInt()-1;
                    int r=nextInt()-1;
                    HashSet<Character> ans=get(arr,1,0,n-1,l,r);
                    System.out.println(ans.size());
                }
            }
            // for(int i=0;i<n;i++){
            //     pw.print(arr[i]);
            // }
        }
        pw.close();
    }
    static void update(char[] arr,int v,int tl,int tr,int pos,char val){
        if(tl==tr){
            

            // if(!((2*v<seg.length&&seg[2*v].contains(arr[pos]))||((2*v+1)<seg.length&&seg[2*v+1].contains(arr[pos])))){
            //     System.out.println("fuck");
                seg[v].remove(arr[pos]);
           // }
            seg[v].add(val);
        }
        else{
            int tm=(tl+tr)/2;
            if(pos<=tm){
                update(arr,2*v,tl,tm,pos,val);
                //seg[v].remove(arr[pos]);
            }
            else{
                update(arr,2*v+1,tm+1,tr,pos,val);
                //seg[2*v+1].remove(arr[pos]);
            }
            seg[v]=new HashSet<>();
            for(int i=0;i<26;i++){
                char ch=(char)(i+'a');
                if(seg[2*v].contains(ch)){
                    seg[v].add(ch);
                }
                else if(seg[2*v+1].contains(ch)){
                    seg[v].add(ch);
                }
            }
        }
    }
    static void build(char[] arr,int v,int tl,int tr){
        if(tl==tr){
            seg[v].add(arr[tl]);
        }
        else{
            int tm=(tl+tr)/2;
            build(arr,2*v,tl,tm);
            build(arr,2*v+1,tm+1,tr);
            for(int i=0;i<26;i++){
                char ch=(char)(i+'a');
                if(seg[2*v].contains(ch)){
                    seg[v].add(ch);
                }
                else if(seg[2*v+1].contains(ch)){
                    seg[v].add(ch);
                }
            }
        }
    }
    static HashSet<Character> get(char[] arr,int v,int tl,int tr,int l,int r){
        if(l>r){
            return new HashSet<Character>();
        }
        if(l==tl&&r==tr){
            return seg[v];
        }
        int tm=(tl+tr)/2;
     //   =new HashSet<Character>();
   //     HashSet<Character> b=new HashSet<Character>();
        HashSet<Character> a=get(arr,2*v,tl,tm,l,Math.min(tm,r));
        HashSet<Character> b=get(arr,2*v+1,tm+1,tr,Math.max(tm+1,l),r);
        HashSet<Character> ans=new HashSet<>();
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(a.contains(ch)){
                ans.add(ch);
            }
            else if(b.contains(ch)){
                ans.add(ch);
            }
        }
        return ans;
    }
    static class Pair implements Comparable<Pair>{
        int x;int y;
        Pair(int x,int y){
            this.x=x;
    
            this.y=y;
        }   
        public int compareTo(Pair p){
            return x-p.x;

        }
    }
    static long ncr(long n,long r){
        if(r==0)
            return 1;
        long val=ncr(n-1,r-1);
        val=(n*val)%mod;
        val=(val*modInverse(r,mod))%mod;
        return val;
    }
    public static BufferedReader br;
    public static StringTokenizer st;
    public static String next() {
        while (st == null || !st.hasMoreTokens()) {
           try{
                st = new StringTokenizer(br.readLine());
            }
            catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }
    public static Integer nextInt() {
        return Integer.parseInt(next());
    }
    public static Long nextLong() {
        return Long.parseLong(next());
    }
 
    public static Double nextDouble() {
        return Double.parseDouble(next());
    }
    public static int[] na(int n)throws IOException{
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = nextInt();
        return a;
    }
    static class query implements Comparable<query>{
        int l,r,idx,block;
        static int len;
        query(int l,int r,int i){
            this.l=l;
            this.r=r;
            this.idx=i;
            this.block=l/len;
        }   
        public int compareTo(query a){
            return block==a.block?r-a.r:block-a.block;
        }
    }
    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 ||  
            n % 3 == 0) 
            return false; 
      
        for (int i = 5; 
                 i * i <= n; i = i + 6) 
            if (n % i == 0 || 
                n % (i + 2) == 0) 
                return false; 
      
        return true; 
    } 
    static long gcd(long a, long b) { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }  
    static long power(long x, long y, long m){ 
        if (y == 0) 
            return 1;      
        long p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
      
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    }
    static long fast_pow(long base,long n,long M){
        if(n==0)
           return 1;
        if(n==1)
        return base;
        long halfn=fast_pow(base,n/2,M);
        if(n%2==0)
            return ( halfn * halfn ) % M;
        else
            return ( ( ( halfn * halfn ) % M ) * base ) % M;
    }
    static long modInverse(long n,long M){
        return fast_pow(n,M-2,M);
    }
} 