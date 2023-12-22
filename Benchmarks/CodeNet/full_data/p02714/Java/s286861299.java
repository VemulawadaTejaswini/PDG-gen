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
        // int t=sc.nextInt();
        int t=1;
        u:while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            long ans=0;
            HashSet<Integer> hset[] =new HashSet[3];
            ArrayList<Integer> arr[] =new ArrayList[3];
            for(int i=0;i<3;i++){
                hset[i]=new HashSet<>();
                arr[i]=new ArrayList<>();
            }
            char c;
            for(int i=0;i<n;i++){
                c=s.charAt(i);
                if(c=='R'){
                    hset[0].add(i);
                    arr[0].add(i);
                }
                if(c=='G'){
                    hset[1].add(i);
                    arr[1].add(i);
                }
                if(c=='B'){
                    hset[2].add(i);
                    arr[2].add(i);
                }
            }
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    for(int k=0;k<3;k++)
                        ans+=count(i,j,k,arr,hset);
            pw.println(ans);
        }
    }
    public static long count(int a, int b, int c, ArrayList<Integer> arr[], HashSet<Integer> hset[]){
        if(a==b||a==c||b==c)
            return 0;
        int i=0,j=0,k=0,p,u;
        long ans=0;
        while(i<arr[a].size()){
            while(j<arr[b].size()&&arr[b].get(j)<=arr[a].get(i))
                j++;
            if(j>=arr[b].size())
                break;
            p=j;
            while(k<arr[c].size()&&arr[c].get(k)<=arr[b].get(j))
                k++;
            u=k;
            if(k>=arr[c].size())
                break;
            while(p<arr[b].size()){
                while(u<arr[c].size()&&arr[c].get(u)<=arr[b].get(p))
                    u++;
                if(u>=arr[c].size())
                    break;
                ans+=(arr[c].size()-u);
                if(hset[c].contains(2*arr[b].get(p)-arr[a].get(i)))
                    ans-=1;
                p++;
            }
            i++;
        }
        return ans;
    }
    public static void sort(long []arr){
        ArrayList<Long> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        Collections.sort(list);
        for(int i=0;i<arr.length;i++)
            arr[i]=list.get(i);
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
    static class Pair{
        long u, v;
        Pair(long a,long b){
            this.u=a;
            this.v=b;
        }   
    }
        // public int compareTo(Pair p){
        //     return (b-p.b);
        // }
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
        return a>b?gcd(b, a % b):gcd(a, b % a);  
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