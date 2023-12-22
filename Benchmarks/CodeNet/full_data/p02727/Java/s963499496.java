/*
 *  author : Atul Anand   
 *  created on : Sat Mar 28 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int X = in.nextInt();
        int Y = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        PriorityQueue<Apple> pq = new PriorityQueue<>(new Comparator<Apple>(){
            public int compare(Apple a, Apple b){
                return b.val - a.val;
            }
        });

        for(int i = 0; i < A; i++){
            pq.add(new Apple(in.nextInt(), 0));       
        }
        for(int i = 0; i < B; i++){
            pq.add(new Apple(in.nextInt(), 1));       
        }
        for(int i = 0; i < C; i++){
            pq.add(new Apple(in.nextInt(), -1));       
        }

        long ans = 0;
        int dueforY = 0;    

        while(X > 0 || Y > 0){
            Apple apple = pq.poll();
            if(apple.type == 0){
                if(X > 0){
                    X--;
                    ans += apple.val;
                }
                else if(dueforY > 0){
                    Y--;
                    dueforY--;
                    ans += apple.val;
                }
            }
            else if(apple.type == 1){
                if(Y > 0){
                    Y--;
                    ans += apple.val;
                }
            }
            else{
                // colorless apple
                if(X > 0){
                    X--;
                    dueforY++;
                    ans += apple.val;
                }
                else if(Y > 0){
                    Y--;
                    ans += apple.val;
                }
            }
        }

        println(ans);
        in.close();
        out.close();
    }

    static class Apple{
        int val;
        int type;

        Apple(int v, int t){
            val = v;
            type = t;
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