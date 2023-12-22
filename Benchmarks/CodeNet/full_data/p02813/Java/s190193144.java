/*
 *  author : Atul Anand   
 *  created on : Wed Apr 01 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int P[] = new int[N];
        int Q[] = new int[N];
        String A = "";
        String B = "";
        for(int i = 0; i < N; i++){
            P[i] = in.nextInt();
            A += P[i];
        } 
        for(int i = 0; i < N; i++){
            Q[i] = in.nextInt();
            B += Q[i];
        }
        int ans = 0;
        if(Integer.parseInt(A) <= Integer.parseInt(B)){
            while(!match(P, Q)){
                nextPermutation(P);
                ans++;
            }
        }
        else{
            while(!match(Q, P)){
                nextPermutation(Q);
                ans++;
            }
        }
        println(ans);
        in.close();
        out.close();
    }

    public static boolean match(int P[], int Q[]){
        for(int i = 0; i < P.length; i++){
            if(P[i] != Q[i]){
                return false;
            }
        }

        return true;
    }

    public static void nextPermutation(int[] nums) {
        int N = nums.length;
        if(N == 1){
            return;
        } 
        
        for(int i = N-1; i >= 1; i--){
            //if decreasing element found
            if(nums[i] > nums[i-1]){      
                int minIndex = i;
                for(int j = i+1; j < N; j++){
                    if(nums[j] > nums[i-1] && nums[j] <= nums[minIndex]){
                        minIndex = j;
                    }
                }
                
                //Swap the minimum greater element
                int temp = nums[i-1];
                nums[i-1] = nums[minIndex];
                nums[minIndex] = temp;
                
                //reverse elements to the right
                reverse(nums, i, N-1);
                return;        
            }    
        }
        
        reverse(nums, 0, N-1);
    }
    
    static void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
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