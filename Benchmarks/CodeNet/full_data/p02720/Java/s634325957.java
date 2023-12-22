import java.util.*;
import java.io.*;



public class Main {
    public static PrintStream out = new PrintStream(System.out);
    static LinkedList<Integer> adj[];
    static boolean[] vis;
    static final int nINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
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
                q.add( (10 * x) + 1 );
            }
            else if (d == 9){
                q.add( (10 * x) + 8);
                q.add( (10 * x) + 9);
            }
            else {
                q.add( (10 * x) + d - 1);
                q.add( (10 * x) + d);
                q.add( (10 * x) + d + 1 );                
            }
        }
        out.println(x);
        
//        while(cnt < k){
//            x = q.poll();
//            //out.println(x);
//            cnt++;
//            if(cnt >= k) break;
//            long x2 = (10 * x) + (x % 10);
//           
//            if(x % 10 != 0){
//                long x3 = (10 * x) + (x % 10) - 1;
//                q.add(x3);
//            }
//            
//            q.add(x2);
//            
//            if(x % 10 != 9) {
//                long x1 = (10 * x) + (x % 10) + 1;
//                q.add(x1);
//            }
// 
//        }
//        out.println(x);

    }
    
    //returns index; outputs earliest occurence; -1 if target value does not exist
    static int getUpper(Friend[] arr, int target)  
    {  
        int start = 0, end = arr.length - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr[mid].money <= target) {  
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
    static int getLower(Friend[] arr, int target)  
    {  
        int start = 0, end = arr.length-1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to the left side if the target is smaller  
            if (arr[mid].money >= target) {  
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
    
    static void initAdj(int n){
        adj = new LinkedList[n + 2];
        for(int i = 0; i <= n + 1; i++)
            adj[i] = new LinkedList();
    }

    static String removeLastChar(String ss) {
        if (ss == null || ss.length() == 0) {
            return ss;
        }
        return ss.substring(0, ss.length()-1);
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


class Friend implements Comparable<Friend>{
    public int money;
    public int friendship;
    public Friend(int a, int b){
        money = a;
        friendship = b;
    }

    
    public int compareTo(Friend t) {
        if(this.money < t.money)
            return -1;
        else if (this.money > t.money)
            return 1;
        else 
            return 0;
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

class Tuple{
    public int first;
    public int second;
    public int third;
    public Tuple(int a, int b, int c){
        first = a;
        second = b;
        third = c;
    }
}

class Pair{
    public int first;
    public int second;
    public Pair(int a, int b){
        first = a;
        second = b;
    }
    

}


//class Node implements Comparable<Node>
//{
//    public int V,E;
//    public Node(int v, int e)
//    {
//        this.V=v;
//        this.E=e;s
//    }
//    public int compareTo( Node N ){
//        return E - N.E;
//    }
//}

