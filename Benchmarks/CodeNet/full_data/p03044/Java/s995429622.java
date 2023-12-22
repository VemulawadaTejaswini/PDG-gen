/*
 *  author : Atul Anand   
 *  created on : Fri Apr 03 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        ArrayList<Integer> adj[] = new ArrayList[N];
        for(int i = 0; i < N; i++){
            adj[i] = new ArrayList<>();
        }
        HashMap<String, Integer> dist = new HashMap<>();
        for(int i = 0; i < N - 1; i++){
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            int w = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
            dist.put(Math.min(u, v) +" " + Math.max(u, v), w);   
        }
        int color[] = new int[N];
        Arrays.fill(color, -1);
        bfs(adj, dist, color, N);
        for(int c: color){
            println(c);
        }
        in.close();
        out.close();
    }

    static void bfs(ArrayList<Integer> adj[], HashMap<String, Integer> dist, int color[], int n){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n]; 
        q.add(0);
        color[0] = 0;
        visited[0] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int y: adj[x]){
                if(!visited[y]){
                    visited[y] = true;
                    if(dist.get(Math.min(x, y)+" "+Math.max(x, y)) % 2 == 0){
                        color[y] = color[x];
                    }
                    else{
                        color[y] = (color[x] + 1) % 2;
                    }
                    q.add(y);
                }
            }
        }
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    }
    
    static void read(long arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    }
    
    static void read(String arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
    	} 
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i]+" "); 
    	} 
    	println(""); 
    }

    static void println(int arr[][]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		println(arr[i]); 
    	}
    }
    
    static void debug(Object O) { 
    	System.out.println(O); 
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}