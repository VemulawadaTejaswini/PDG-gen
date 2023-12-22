/*
 *  author : Atul Anand   
 *  created on : Tue Mar 31 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int A = in.nextInt();
        int B = in.nextInt();
        int ans = -1;

        // Min price = 13 since A is at min 1 and 13 is min number for which A >= 1
        // Max price = 1009 since B is at max 100 and 1009 is max number for which B <= 100 
        for(int i = 13; i <= 1009; i++){
            if((i*8) / 100 == A && (i*10)/100 == B){
                ans = i;
                break;
            }
        }

        println(ans);
        in.close();
        out.close();
    }

    /*
    # O(n) Solution -

    public static void main(String[] args){
        int A, B; {int[] a = in.ii(); A = a[0]; B = a[1];}
        double ar = Math.floor((A+1)/0.08);
        double al = Math.ceil(A/0.08);
        double br = Math.floor((B+1)/0.1);
        double bl = Math.ceil(B/0.1);
        int ans = -1;
        if(ar-al >= 1 && br-bl >= 1){
            int tmp = (int)Math.max(al, bl);
            if(tmp < (int)Math.min(ar, br)){
                ans = tmp;
            }
        }
        out.println(ans);
    }
    */

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