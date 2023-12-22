import java.io.*;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.*;
//import javafx.util.Pair; 
//import java.util.concurrent.LinkedBlockingDeque;




    
  public class Main {
        
        public static long mod = (long)Math.pow(10, 9)+7 ;
        public static double epsilon=0.00000000008854;//value of epsilon
        public static InputReader sc = new InputReader(System.in);
        public static PrintWriter pw = new PrintWriter(System.out);
        
        public static ArrayList<ArrayList <Integer>> GetGraph(int n,int m){
            ArrayList<ArrayList <Integer>> g=new ArrayList<>();
            for(int i=0;i<n;i++){
                g.add(new ArrayList<>());
            }
            for(int i=0;i<m;i++){
                int t=sc.nextInt();
                int u=sc.nextInt()-1;
                int v=sc.nextInt()-1;
                g.get(u).add(v);
                if(t==0)
                g.get(v).add(u);
            }
            return g;
        }
        
        public static int find(int a,int p[]){
            if(a!=p[a]){
               p[a]=find(p[a], p);
            }
             return p[a];
        }
        public static void Union(int a,int b,int p[]){
            p[find(b, p)]=find(a, p);
        }
        public static long gcd(long a,long b){
            while(b>0){
                long t=b;
                b=a%b;
                a=t;
            }
            return a;
        }
        public static boolean dfs(ArrayList<ArrayList <Integer>> g,ArrayList<HashSet<Integer>> h,int u,int vis[]){
            vis[u]=1;
            boolean f=false;
            for(int i=0;i<g.get(u).size();i++){
                int v=g.get(u).get(i);
                if(vis[v]==1){

                }



                if(vis[v]==1){
                    if(h.get(v).contains(u)){
                        h.get(u).remove(v);
                    }
                    else f=true;
                }
                if(vis[v]==0)
                if(dfs(g, h,v, vis)){
                    if(h.get(v).contains(u)){
                        h.get(u).remove(v);
                    }
                    else f=true;
                }
                else{
                    if(h.get(v).contains(u)){
                        h.get(v).remove(u);
                    }
                }
            }
            vis[u]=2;
            return f;
        }
        
        
        public static void main(String[] args) {
            // code starts..
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=scanArray(n);
            long dp[][]=new long[n+1][k+1];
            long ans=0;
            Arrays.fill(dp[0], 1);
            //for(int i=0;i<=n;i++)
            //dp[i][0]=1;
            for(int i=1;i<=n;i++){
                for(int j=0;j<=k;j++){
                    long a1=0;
                    if(j-a[i-1]>0){
                        a1=dp[i-1][j-a[i-1]-1];
                    }
                    dp[i][j]=(dp[i-1][j]-a1+mod)%mod;
                    if(i==n&&j==k){
                        ans=dp[i][j];
                    }
                    if(j>0)
                    dp[i][j]+=dp[i][j-1];
                    dp[i][j]%=mod;
                }
            }
            pw.println(ans);
            
                
                         
            // Code ends...
            pw.flush();
            pw.close();
        }
       
        public static Comparator<Integer[]> column(int i){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
                }
            };
        }
        public static Comparator<Pair> C(){
            return 
            new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o2.le-o1.le;//for des
                }
            };
        }
        
        public static Comparator<Integer[]> pair(){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    int result=o1[0].compareTo(o2[0]);
                    if(result==0)
                    result=o1[1].compareTo(o2[1]);
                    return result;
                }
            };
        }
        
        public static String reverseString(String s){
            StringBuilder input1 = new StringBuilder(); 
            input1.append(s);  
            input1 = input1.reverse();
            return input1.toString();
        }
        public static int[] scanArray(int n){
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    
            return a;
        }
        public static long[] scanLongArray(int n){
            long a[]=new long [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
    
            return a;
        }
        public static String [] scanStrings(int n){
            String a[]=new String [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLine();
    
            return a;
        }
        
    }
    
    class InputReader {
    
            private final InputStream stream;
            private final byte[] buf = new byte[8192];
            private int curChar, snumChars;
            private SpaceCharFilter filter;
    
            public InputReader(InputStream stream) {
                this.stream = stream;
            }
    
            public int snext() {
                if (snumChars == -1)
                    throw new InputMismatchException();
                if (curChar >= snumChars) {
                    curChar = 0;
                    try {
                        snumChars = stream.read(buf);
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                    if (snumChars <= 0)
                        return -1;
                }
                return buf[curChar++];
            }
    
            public int nextInt() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                int res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public long nextLong() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                long res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public int[] nextIntArray(int n) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = nextInt();
                }
                return a;
            }
    
            public String readString() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isSpaceChar(c));
                return res.toString();
            }
    
            public String nextLine() {
                int c = snext();
                while (isSpaceChar(c))
                    c = snext();
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isEndOfLine(c));
                return res.toString();
            }
    
            public boolean isSpaceChar(int c) {
                if (filter != null)
                    return filter.isSpaceChar(c);
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
            }
    
            private boolean isEndOfLine(int c) {
                return c == '\n' || c == '\r' || c == -1;
            }
    
            public interface SpaceCharFilter {
                public boolean isSpaceChar(int ch);
            }
        }
        class Pair{
            int le;
            int p;
            Pair(int leaves,int parent){
                le=leaves;
                p=parent;
            }
        }
        
        