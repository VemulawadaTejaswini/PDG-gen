
import java.util.*;
import java.io.*;
 
 
public class Main  {
 
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException{
        //Reader.init(System.in);
        
        Reader.init(System.in);
        int t = 1;//Reader.nextInt();
        while(t-->0){
           solve();
        }
        out.close();
    }
    
    static ArrayList<Integer>[] graph; 
    static ArrayList<Integer>[] graph2; 
    static int n=0;
    static int m=0;
    static int k =0;
    static long mod =1000000007;
    static int MOD = 1000000007;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static ArrayList<Integer> list = new ArrayList<>();
    static boolean cycle= false;
    static boolean[] vis;
    static boolean[] vis2;
    static int max=0;
    static int maxnode=0;
    static int[] arr;
    static long[] ans;
    static long[] sum;
    static int[] size;

    static void solve()throws IOException{
        n = Reader.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Reader.nextInt();
        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1] = Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++){
            int a = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            int b = dp[i-2] + Math.abs(arr[i]-arr[i-2]);

            dp[i] = Math.min(a,b); 
        }
        out.println(dp[n-1]);
        
    }

    /*static void dfs1(int a,int p){
        size[a]=1;
        for(int v: graph[a]){
            if(v!=p){
                dfs1(v,a);
                size[a]+=size[v];
                sum[a]+= (size[v]+sum[v]);
            }
        }
    }
    static void dfs2(int a,int p){
        if(p==-1)
            ans[a]= sum[a];
        else{
            ans[a] = ans[p] - (sum[a]+size[a]) + (n-size[a]) +sum[a];
        }
        for(int v:graph[a]){
            if(v!=p){
                dfs2(v,a);
            }
        }
    }*/

    
    // ggratest common divisor
    static int gcd(int a , int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
 
    // least common multiple
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    
    // a^b
    static long fastpow(long a, long b){
        long res = 1;a=a%mod;
        while(b>0){
            if(b%2==1)
                res = (res*a)%mod;
            a = (a*a)%mod;
            b = b>>1;
        }
        return res;
    }

    // segment tree
   /* static void update(int ind, int l, int h, int pos, int v){
        if(l==h){
            seg[ind] = v;
            return;
        }
        int mid = (l+h)/2;
        if(pos<=mid)
            update(2*ind,l,mid,pos,v);
        else
            update(2*ind+1,mid+1,h,pos,v);
        seg[ind] = seg[2*ind]^seg[2*ind+1];
    }
    static int query(int ind, int l , int h, int ll , int hh){
        if(ll>hh)
            return 0;
        if(l==ll && h==hh)
            return seg[ind];
        int mid = (l+h)/2;
        return query(2*ind,l,mid,ll,Math.min(mid,hh)) ^ query(2*ind+1,mid+1,h,Math.max(mid+1,ll),hh);
    }*/
    // priority queue with comparator
    // PriorityQueue<Interval> pq = new PriorityQueue<>(new Comparator<Interval>() {
    //             public int compare(Interval a, Interval b){
    //                 int diff1 = a.r - a.l;
    //                 int diff2 = b.r - b.l;
 
    //                 if(diff1 == diff2){
    //                     return a.l - b.l;
    //                 }
 
    //                 return diff2 - diff1;
    //             }
    // });
}
 
class trienode{
        int v;
        trienode[] child ;
        boolean leaf;
        int cnt;
        int p=0;
        trienode(int vv){
            child = new trienode[2];
            leaf=false;
            cnt=0;
            v=vv;
        }
        trienode(){
            child = new trienode[2];
            leaf=false;
            cnt=0;
            v=0;
        }
    }
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
 
    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
 
    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }
 
    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
class newcomparator implements Comparator<Integer>{
    //@Override
    public int compare(Integer a, Integer  b){
        return a<=b?1:-1;
    }
 }
class node {
    int f;
    int s;// cost to rreach\
    node(int ff,int ss){
        f=ff;
        s=ss;
    }
}
class mergesort{
    static void sort(int l, int h, int[] arr){
        if(l<h){
            int mid = (l+h)/2;
            
            sort(l,mid,arr);
            sort(mid+1,h,arr);
            merge(l,mid,h,arr);
        }
    }
    static void merge(int l, int m , int h , int [] arr){

        int[] left = new int[m-l+1];
        int[] right = new int[h-m];
        for(int i= 0 ;i< m-l+1;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<h-m;i++){
            right[i] = arr[m+1+i];
        }
        //now left and right arrays are assumed to be sorted and we have tp merge them together 
        // int the original aaray.
        int i=l;
        int lindex = 0;
        int rindex =  0;
        
        while(lindex<m-l+1 && rindex<h-m){
            if(left[lindex]<=right[rindex]){
                arr[i]=left[lindex];
                lindex++;
                i++;
            }
            else{
                arr[i]=right[rindex];
                rindex++;
                i++;
            }
        }
        while(lindex<m-l+1){
            arr[i]=left[lindex];
            lindex++;
            i++;
        }
        while(rindex<h-m){
            arr[i]=right[rindex];
            rindex++;
            i++;
        }
    }
    
}
 
 
