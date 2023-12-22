/*
    Arnab Chanda 
*/

// All imports here

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

// Template code starts here //

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Debugger debug = new Debugger(out);
        Objectify objectify = new Objectify(debug);
        Task solver = new Task();
        int test = 1;
        while(test-->0){
            solver.solve(1, in, out, debug, objectify);
        }
		out.close();
	}
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
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

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public float nextFloat() {
        return Float.parseFloat(next());
    }
 
}

class Debugger{
    PrintWriter out;

    Debugger(PrintWriter out){    
        this.out = out;
    }

    public <T> void printList(List<T> arrayList){
        for( Object ob: arrayList){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printSet(Set<T> set){
        for(Object ob: set){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printMap(Map<?,?> map){
        for(Object ob: map.keySet()){
            System.out.println(ob+" : "+map.get(ob));
        }
    }
}

class Objectify{
    
    Debugger debug;

    Objectify(Debugger ob){ debug = ob; }

    public void printArr(int[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(double[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(long[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(char[] arr){ debug.printList( String.valueOf(arr).chars().mapToObj(c -> (char) c).collect(Collectors.toList())); }
    public void printArr(String[] arr){ debug.printList(Arrays.asList(arr)); }

    public void printMatrix(int[][] arr){ for(int a[]:arr) printArr(a); }
    public void printMatrix(double[][] arr){ for(double a[]:arr) printArr(a); }
    public void printMatrix(long[][] arr){ for(long a[]:arr) printArr(a); }
    public void printMatrix(char[][] arr){ for(char a[]:arr) printArr(a); }
    public void printMatrix(String[][] arr){ for(String a[]:arr) printArr(a); }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Template code ends here


class Task {

    final long MOD = (int)Math.pow(10,9)+7;

    final int V_SUM_MAX = 100000; 
    final int N_MAX = 100; 
    final int W_MAX = 1000000000; 
      
    // To store the states of DP  
    int dp[][] = new int[V_SUM_MAX + 1][N_MAX];  
    boolean v[][] = new boolean [V_SUM_MAX + 1][N_MAX];  
      
    // Function to solve the recurrence relation  
    public int solveDp(int r, int i, int w[],        
                          int val[], int n)  
    {  
        // Base cases  
        if (r <= 0)  
            return 0;  
              
        if (i == n)  
            return W_MAX;  
              
        if (v[r][i])  
            return dp[r][i];  
      
        // Marking state as solved  
        v[r][i] = true;  
      
        // Recurrence relation  
        dp[r][i] = Math.min(solveDp(r, i + 1, w, val, n),  
                     w[i] + solveDp(r - val[i],  
                                    i + 1, w, val, n));  
          
        return dp[r][i];  
    }  
      
    // Function to return the maximum weight  
    public int maxWeight(int w[], int val[],  
                         int n, int c)  
    {  
      
        // Iterating through all possible values  
        // to find the the largest value that can  
        // be represented by the given weights  
        for (int i = V_SUM_MAX; i >= 0; i--) 
        {  
            if (solveDp(i, 0, w, val, n) <= c)  
            {  
                return i;  
            }  
        }  
        return 0;  
    } 
    public void solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // write your code here
        int n = sc.nextInt();
        int w = sc.nextInt();

        int wt[] = new int[n];
        int val[] = new int[n];

        for(int  i = 0; i < n; i++){
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }

        out.println(maxWeight(wt, val, n, w));

    }
}