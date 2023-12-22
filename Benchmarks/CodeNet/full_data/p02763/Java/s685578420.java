import java.io.*; 
import java.util.*; 
//import javafx.util.*; 
import java.math.*;
//import java.lang.*;
public class Main 
{ 
    
    // static int n;static ArrayList<Integer> arr[];
    // static int m;
    // static boolean v[];
   // int ans[];
    //static int arr[];
    static final long oo=(long)1e18;
    static int mod=1000000007;
    static String s;
    public static void main(String[] args) throws IOException { 
    //    Scanner sc=new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        br = new BufferedReader(new InputStreamReader(System.in));
        s=" "+next();
 
        int n=s.length()-1;
      //  System.out.println(n);
        int seg[]=new int[n*4];
        build(1,1,n,seg);    
        int q=nextInt();
        while(q--!=0){
            int type=nextInt();
            if(type==1){
                update(seg,1,1,n,nextInt(),next().charAt(0));
            }
            else{
                pw.println(Integer.bitCount(query(seg,1,1,n,nextInt(),nextInt())));
            }
        }    
    
            
 
        pw.close();
    }
    static void build(int v,int tl,int tr,int seg[]){
        if(tl==tr){
            seg[v]=1<<(int)(s.charAt(tl)-'a');
        }
        else{
            int mid=(tl+tr)/2;
            build(2*v,tl,mid,seg);
            build(2*v+1,mid+1,tr,seg);
            seg[v]=seg[2*v]|seg[2*v+1];
        }
 
    }
    static void update(int seg[],int v,int tl,int tr,int pos,char new_val){
        if(tl==tr){
            seg[v]=(int)1<<new_val-'a';
        }
        else{
            int mid=(tl+tr)/2;
            if(pos<=mid)
                update(seg,2*v,tl,mid,pos,new_val);
            else
                update(seg,2*v+1,mid+1,tr,pos,new_val);
            seg[v]=seg[2*v]|seg[2*v+1];
        }
 
    }
    static int query(int seg[],int v,int tl,int tr,int l,int r){
        if(l>r){
            return 0;
        }
        if(tl==l&&tr==r){
            return seg[v];
        }
        int mid=(tl+tr)/2;
        return (query(seg,2*v,tl,mid,l,(int)Math.min(mid,r)))|(query(seg,2*v+1,mid+1,tr,(int)Math.max(mid+1,l),r));
        
    }
    // static int find(int a){
    //     if(arr[a]<0)
    //         return a;
    //     return (a=find(arr[a]));
    // }
    // static void union(int a,int b){
    //     arr[b]=a;
        
    // }
    public static BufferedReader br;
    public static StringTokenizer st;
    public static String next() {
        while (st == null || !st.hasMoreTokens()) {
       try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
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
    // static class Pair{
    //     int x;int y;
    //     Pair(int x,int y,int z){
    //         this.x=x;
    //         this.y=y;
    //        // this.z=z;
    //      //   this.z=z;
    //       //  this.i=i;
    //     }
    // }
    // static class sorting implements Comparator<Pair>{
    //     public int compare(Pair a,Pair b){
    //         //return (a.y)-(b.y);
    //         if(a.y==b.y){
    //             return -1*(a.z-b.z);
    //         }
    //         return (a.y-b.y);
    //     }
   // }
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
    static int gcd(int a, int b) { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }  
    // static long modInverse(long a, long m) { 
    //     long g = gcd(a, m); 
    //     if (g != 1) 
    //         return -1; 
    //     else{ 
    //         // If a and m are relatively prime, then modulo inverse 
    //         // is a^(m-2) mode m 
    //         return (power(a, m - 2, m)); 
    //     } 
    // } 
      
    // To compute x^y under modulo m 
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
       static long modInverse(long n,int M){
        return fast_pow(n,M-2,M);
    }
    
} 