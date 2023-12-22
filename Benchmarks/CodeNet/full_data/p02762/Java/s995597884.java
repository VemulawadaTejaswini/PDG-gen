import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

class Main
{
    // driver function to test the above functions
    public static void main(String args[]) throws IOException
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int m = Reader.nextInt();
        int k = Reader.nextInt();

        ArrayList<ArrayList<Integer>> list  = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> list2  = new ArrayList<ArrayList<Integer>>();
        int[] ans = new int[n];
        

        for (int i=0; i<n; i++){
            list.add(new ArrayList<Integer>());
            list2.add(new ArrayList<Integer>());
            ans[i]=0;
           
        }

        
        for (int i=0;i<m; i++){
            int val1 = Reader.nextInt();
            int val2 = Reader.nextInt();

            list.get(val1-1).add(val2-1);
            list.get(val2-1).add(val1-1);
        }

        for (int i=0;i<k; i++){
            int val1 = Reader.nextInt();
            int val2 = Reader.nextInt();

            list2.get(val1-1).add(val2-1);
            list2.get(val2-1).add(val1-1);
        }
        solu s = new solu();
        

        for (int i=0; i<n; i++){
            ArrayList<Boolean> b_arr = new ArrayList<Boolean>();
            boolean[] vis = new boolean[n];
            if (vis[i]==false){
                
                s.DFS(i,vis,list,b_arr);
            }
            int count=b_arr.size();
            for (int j=0; j<n; j++){
                if (vis[j]==true){
                    System.out.println(count-1-list.get(j).size()-list2.get(j).size());
                }
            }
            
           
        }
        
    }
    
}

class solu{
    public void DFS(int i, boolean[] vis, ArrayList<ArrayList<Integer>> list, ArrayList<Boolean> b_arr){
        vis[i] = true;
        b_arr.add(true);
        ArrayList<Integer> sub = list.get(i);
        int len = sub.size();
        for (int j=0; j<len; j++){
            int val = sub.get(j);
            if (vis[val]==false){
                DFS(val,vis,list,b_arr);
            }
        }
    }
}

/** Class for buffered reading int and double values */
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
    
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}