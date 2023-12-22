import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }
    static int L,R,top,bottom;
    // static int ans;
    public static void solve(InputReader sc, PrintWriter pw) {
        int t=1;
        u:while(t-->0){
            
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            // int temp=0;
            int n=a+b+c;
            Pair []arr=new Pair [n];
            for(int i=0;i<n;i++)
                arr[i]=new Pair(i<a?0:(i<a+b?1:2),sc.nextLong());
            Arrays.sort(arr);
            b=0;
            int r=0,p=0;
            long ans=0;
            for(int i=0;i<n&&r+b+p<x+y;i++){
                if(arr[i].u==0){
                    if(r<x){
                        r++;
                        // System.out.println(arr[i].val);
                        ans+=arr[i].val;
                    }
                }
                else if(arr[i].u==1){
                    if(b<y){
                        b++;
                        // System.out.println(arr[i].val);
                        ans+=arr[i].val;
                    }
                }
                else{
                    // System.out.println(arr[i].val);
                    ans+=arr[i].val;
                    p++;
                }
            }
            // for(int i=1;i<n;i++)
            pw.println(ans);
        }
    }
    public static void swap(char []chrr, int i, int j){
        char temp=chrr[i];
        chrr[i]=chrr[j];
        chrr[j]=temp;
    }
    public static int num(int n){
        int a=0;
        while(n>0){
            a+=(n&1);
            n>>=1;
        }
        return a;
    }
    static class Pair implements Comparable<Pair>{
        long u, val;
        Pair(int a,long val){
            this.u=a;
            this.val=val;
        }   
        @Override
        public int compareTo(Pair p){
            return (val-p.val)<0?1:(val-p.val==0?0:-1);
        }
    }
        // public int hashCode(){
        //     int hashcode = (a+" "+b).hashCode();
        //     return hashcode;
        // }
         
        // public boolean equals(Object obj){
        //     if (obj instanceof Pair) {
        //         Pair p = (Pair) obj;
        //         return (p.a==this.a && p.b == this.b);
        //     }
        //     return false;
        // }
 
    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
        return true; 
    } 
    static int gcd(int a, int b) { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
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
    public static void feedArr(long []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextLong();
    }
    public static void feedArr(double []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextDouble();
    }
    public static void feedArr(int []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
    }
    public static void feedArr(String []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.next();
    }
    public static String printArr(int []arr){
        StringBuilder sbr=new StringBuilder();
        for(int i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public  static String printArr(long []arr){
        StringBuilder sbr=new StringBuilder();
        for(long i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(String []arr){
        StringBuilder sbr=new StringBuilder();
        for(String i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(double []arr){
        StringBuilder sbr=new StringBuilder();
        for(double i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
// class Novel implements Comparable<Novel>{
//     int u, v;
//     Novel(int a,int b){
//         this.u=a;
//         this.v=b;
//     }   
// // }
//     @Override
//     public int compareTo(Novel p){
//         return (v-p.v);
//     }
// }