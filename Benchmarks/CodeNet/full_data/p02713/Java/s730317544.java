import java.util.*;
import java.io.*;
 
//294784RY
 
public class Main {
    public static PrintStream out = new PrintStream(System.out);
    static LinkedList<Integer> adj[];
    static boolean[] vis;
    static final int nINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int k = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= k; i++){
            for(int j = 1; j <= k; j++){
                for(int q = 1; q <= k; q++){
                    int d = gcd(i, j);
                    int e = gcd(q, d);
                    sum += e;
                }
            }
        }
        out.println(sum);
 
    }
            
    static void initAdj(int n){
        adj = new LinkedList[n + 2];
        for(int i = 0; i <= n + 1; i++)
            adj[i] = new LinkedList();
    }    
    
    static void dfs(int n){
        Iterator<Integer> i = adj[n].listIterator();
        while(i.hasNext()){
            Integer a = i.next();
            if(!vis[a]){
                vis[a] = true;
                dfs(a);
            }
        }
    }
    
     static long fastPower(long x, int y) {
        long result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;
    }
     
    static ArrayList<Integer> moveToFront(ArrayList<Integer> list, int num){
        //int item = list.indexOf(num);
        int index = list.indexOf(num);
        list.remove(index);
        list.add(0, num);
        return list;
    }
    
    static ArrayList<Integer> sieve(int n){
        boolean prime[] = new boolean[n+1]; 
        ArrayList<Integer> res = new ArrayList();
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                res.add(i);
        }
        return res;
    }
    
    //returns index; outputs earliest occurence; -1 if target value does not exist
    static int getUpper(int[] arr, int target)  
    {  
        int start = 0, end = arr.length - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr[mid] <= target) {  
                start = mid + 1;  
            }  
    
            // Move left side.  
            else {  
                ans = mid;  
                end = mid - 1;  
            }  
        }  
        return ans;  
    }  
    
    //returns index; outputs latest occurence; -1 if target value does not exist
    static int getLower(int[] arr, int target)  
    {  
        int start = 0, end = arr.length-1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to the left side if the target is smaller  
            if (arr[mid] >= target) {  
                end = mid - 1;  
            }  
    
            // Move right side  
            else {  
                ans = mid;  
                start = mid + 1;  
            }  
        }  
        return ans;  
    }  
     
   
 
    static String removeLastChar(String ss) {
        if (ss == null || ss.length() == 0) {
            return ss;
        }
        return ss.substring(0, ss.length()-1);
    }
    
    static void solveLunLun(){
        FastScanner sc = new FastScanner();
        Queue<Long> q = new ArrayDeque();
        for(int i = 1; i <= 9; i++){
            q.add((long) i);
        }
        int k = sc.nextInt();
        int cnt = 0;
        long x = 1;
        while(cnt < k){
            x = q.poll();
            cnt++;
            if(cnt >= k) break;
            
            long d = x % (long) 10;
            if(d == 0){
                q.add( (10 * x));
                q.add( (10 * x) + d + 1 );
            }
            else if (d == 9){
                q.add( (10 * x) + d - 1);
                q.add( (10 * x) + d);
            }
            else {
                q.add( (10 * x) + d - 1);
                q.add( (10 * x) + d);
                q.add( (10 * x) + d + 1 );                
            }
        }
        out.println(x);
 
    }
    
    private static int factorial(int n){
            int fac = 1;
            for(int i=2;i<=n;i++){
                    fac *= i;
            }
 
            return fac;
    }
    
    private static boolean isPrime(int n){
            if(n == 0 || n == 1){
                    return false;
            }else if(n%2 == 0){
                    return false;
            }else{
                    int x = (int)(Math.sqrt(n)) + 1;
                    for(int i=3;i<=x;i+=2){
                            if(n % i == 0){
                                    return false;
                            }
                    }
                    return true;
            }
    }
 
    private static long pow(int base,int exp){
            if(exp == 0){
                    return 1;
            }else if(exp == 1){
                    return base;
            }else{
                    long a = pow(base,exp/2);
                    if(exp%2 == 0){
                            return a * a;
                    }else{
                            return a * a * base;
                    }
            }
 
    }
 
    private static int gcd(int a,int b){
            if(a == 0){
                    return b;
            }
 
            return gcd(b%a,a);
    }
 
    private static int lcm(int a,int b){
            return (a * b)/gcd(a,b);
    }
    
 
    
    private static int BSearch(int target, int[] arr){
        int index = -1;
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r){
            int mid = (l + r) / 2;
            if(arr[mid] <= target){
                index = mid;
                l = mid + 1;
            } else{
                r = mid - 1;    
            }
        }
        
        return index;
    }
        
 
}
 
 
class FastScanner { 
    BufferedReader br; 
    StringTokenizer st; 
 
    public FastScanner() 
    { 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 
 
    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
 
    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 
 
    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 
 
    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 
 
    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
 
    int[] nextIntArray(int length) {
       int[] arr = new int[length];
       for (int i = 0; i < length; i++)
           arr[i] = nextInt();
       return arr;
   }
} 
 
class Node
{
    public int V;
    public Node(int v)
    {
        this.V=v;
    }
}
 
 
 
//    private static ArrayList<Integer> primeSieve(int n){
//        boolean b[] = new boolean[n+1];
//        b[0] = true;
//        b[1] = true;
//        for(int i=2;i<=5;i++){
//                int j = 2;
//                while(i * j <= n && !b[i]){
//                        b[i * j] = true;
//                        j++;
//                }
//        }
// 
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=2;i<n+1;i++){
//                if(!b[i]){
//                        arr.add(i);
//                }
//        }
// 
//        return arr;
//    }   
 
 
 
//        int n = sc.nextInt();
//        HashMap<Integer, Integer> map = new HashMap();
//        int[] arr = new int[n];
//        int[] freq = new int[200005];
//        for(int i = 0; i < n; i++){
//            int x = sc.nextInt();
//            if(!map.containsKey(x))
//                map.put(x, 1);
//            freq[x]++;
//            arr[i] = x;
//        }
//        long sum = 0;
//        //out.println("map size: " + map.size());
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            int curr = entry.getKey();
//            int x = freq[curr];
//            double a  = x * ( (double) (x - 1) / 2);
//            sum += (int) a;
//        }
//        //out.println("sum: " + sum);
//        for(int i = 0; i < n; i++){
//            int curr  = arr[i];
//            int oldFreq = freq[curr];
//            double a  = oldFreq * ( (double) (oldFreq - 1) / 2);
//            int newFreq = freq[curr] - 1;
//            double b  = newFreq * ( (double) (newFreq - 1) / 2);
//            long sub = (long) a - (long) b;
//            //out.println("sub: " + sub);
//            out.println(sum - sub);
//        }