import java.io.*;
import java.util.*;
 import java.math.BigInteger; 
public class Main{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }
    static int L,R;
    // static int ans;
    public static void solve(InputReader sc, PrintWriter pw) {
        // int t=sc.nextInt();
        int t=1;
        // int a=0,b=0;
        u:while(t-->0){
            int n=sc.nextInt(),a,b;
            HashMap<Integer,List<Integer>> hmap=new HashMap<>();
            for(int i=0;i<n-1;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                hmap.putIfAbsent(a,new ArrayList<>());
                hmap.putIfAbsent(b,new ArrayList<>());
                hmap.get(a).add(b);
                hmap.get(b).add(a);
            }
            HashMap<Integer,List<Integer>> levels=new HashMap<>();
            boolean []vis=new boolean [n];
            Arrays.fill(vis,false);
            dfs(hmap,vis,1,levels,0);
            int a1=1,a2=2,a3=3;
            List<Integer> list;
            // System.out.println(levels);
            int []ans=new int [n];
            for(int i:levels.keySet()){
                list=levels.get(i);
                for(int j:list){
                    if(((i/3)&1)==0&&(i%3==1)||((i/3)&1)==1&&(i%3==2)){
                        if(a1>n){
                            pw.println("-1");
                            continue u;
                        }
                        ans[j-1]=a1;
                        a1+=3;
                    }
                    else if(((i/3)&1)==1&&(i%3==1)||((i/3)&1)==0&&(i%3==2)){
                        if(a2>n){
                            pw.println("-1");
                            continue u;
                        }
                        ans[j-1]=a2;
                        a2+=3;
                    }
                    else{
                        if(a3>n){
                            pw.println("-1");
                            continue u;
                        }
                        ans[j-1]=a3;
                        a3+=3;
                    }
                }
            }
            StringBuilder sbr=new StringBuilder();
            for(int i:ans)
                sbr.append(i+" ");
            pw.println(sbr.toString());
        }
    }
    public static void dfs(HashMap<Integer,List<Integer>> hmap,boolean []vis,int i,HashMap<Integer,List<Integer>> levels,int d){
        vis[i-1]=true;
        levels.putIfAbsent(d,new ArrayList<>());
        levels.get(d).add(i);
        if(hmap.containsKey(i)){
            for(int j:hmap.get(i)){
                if(!vis[j-1]){
                    dfs(hmap,vis,j,levels,d+1);
                }
            }
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
        int a, b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }   
        public int compareTo(Pair p){
            return (b-p.b);
        }
        public int hashCode(){
            int hashcode = (a+" "+b).hashCode();
            return hashcode;
        }
         
        public boolean equals(Object obj){
            if (obj instanceof Pair) {
                Pair p = (Pair) obj;
                return (p.a==this.a && p.b == this.b);
            }
            return false;
        }
    }
 
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