import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        
        public int read() {
            if (numChars==-1) 
                throw new InputMismatchException();
            
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                
                if(numChars <= 0)               
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();
            
            while(isSpaceChar(c)) 
                c = read();
            
            int sgn = 1;
            
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            
            int res = 0;
            do {
                if(c<'0'||c>'9') 
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c)); 
            
            return res * sgn;
        }
        
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
        
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } 
            while (!isSpaceChar(c));
            
            return res.toString();
        }
     
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public String next() {
            return readString();
        }
        
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
    class Graph 
    { 
        private int V;   // No. of vertices 
      
        // Array  of lists for Adjacency List Representation 
        private LinkedList<Integer> adj[]; 
        int time = 0; 
        static final int NIL = -1; 
      
        // Constructor 
        Graph(int v) 
        { 
            V = v; 
            adj = new LinkedList[v]; 
            for (int i=0; i<v; ++i) 
                adj[i] = new LinkedList(); 
        } 
      
        //Function to add an edge into the graph 
        void addEdge(int v, int w) 
        { 
            adj[v].add(w);  // Add w to v's list. 
            adj[w].add(v);    //Add v to w's list 
        } 
      
        // A recursive function that find articulation points using DFS 
        // u --> The vertex to be visited next 
        // visited[] --> keeps tract of visited vertices 
        // disc[] --> Stores discovery times of visited vertices 
        // parent[] --> Stores parent vertices in DFS tree 
        // ap[] --> Store articulation points 
        void APUtil(int u, boolean visited[], int disc[], 
                    int low[], int parent[], boolean ap[]) 
        { 
      
            // Count of children in DFS Tree 
            int children = 0; 
      
            // Mark the current node as visited 
            visited[u] = true; 
      
            // Initialize discovery time and low value 
            disc[u] = low[u] = ++time; 
      
            // Go through all vertices aadjacent to this 
            Iterator<Integer> i = adj[u].iterator(); 
            while (i.hasNext()) 
            { 
                int v = i.next();  // v is current adjacent of u 
      
                // If v is not visited yet, then make it a child of u 
                // in DFS tree and recur for it 
                if (!visited[v]) 
                { 
                    children++; 
                    parent[v] = u; 
                    APUtil(v, visited, disc, low, parent, ap); 
      
                    // Check if the subtree rooted with v has a connection to 
                    // one of the ancestors of u 
                    low[u]  = Math.min(low[u], low[v]); 
      
                    // u is an articulation point in following cases 
      
                    // (1) u is root of DFS tree and has two or more chilren. 
                    if (parent[u] == NIL && children > 1) 
                        ap[u] = true; 
      
                    // (2) If u is not root and low value of one of its child 
                    // is more than discovery value of u. 
                    if (parent[u] != NIL && low[v] >= disc[u]) 
                        ap[u] = true; 
                } 
      
                // Update low value of u for parent function calls. 
                else if (v != parent[u]) 
                    low[u]  = Math.min(low[u], disc[v]); 
            } 
        } 
      
        // The function to do DFS traversal. It uses recursive function APUtil() 
        boolean[] AP() 
        { 
            // Mark all the vertices as not visited 
            boolean visited[] = new boolean[V]; 
            int disc[] = new int[V]; 
            int low[] = new int[V]; 
            int parent[] = new int[V]; 
            boolean ap[] = new boolean[V]; // To store articulation points 
      
            // Initialize parent and visited, and ap(articulation point) 
            // arrays 
            for (int i = 0; i < V; i++) 
            { 
                parent[i] = NIL; 
                visited[i] = false; 
                ap[i] = false; 
            } 
      
            // Call the recursive helper function to find articulation 
            // points in DFS tree rooted with vertex 'i' 
            for (int i = 0; i < V; i++) 
                if (visited[i] == false) 
                    APUtil(i, visited, disc, low, parent, ap); 

            return ap;
        } 
    }
    public void run() {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int deg[] = new int[n];

        Graph g = new Graph(n);

        for(int i = 0; i < m; ++i) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            g.addEdge(u, v);
            deg[u]++;
            deg[v]++;
        }

        for(int i = 0; i < n; ++i) {
            if(deg[i] % 2 != 0) {
                w.print("No");
                w.close();
                return;
            }
        }

        boolean[] ap = g.AP();

        int cnt[] = new int[2];

        for(int i = 0; i < n; ++i) {
            if(ap[i]) {
                if(deg[i] >= 6)
                    cnt[1]++;
                else if(deg[i] >= 4)
                    cnt[0]++;
            }
        }

        if(cnt[0] >= 2 || cnt[1] >= 1) {
            w.print("Yes");
        }
        else
            w.print("No");

        w.close();
    }
}