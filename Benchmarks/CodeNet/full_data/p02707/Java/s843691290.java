import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

public class Main {
    // driver function to test the above functions
    public static void main(String args[]) throws IOException {

        Reader.init(System.in);
        int n=  Reader.nextInt();
       int[] arr = new int[n];

       boolean[] veri = new boolean[n];
        for (int i=0; i<n-1
                ; i++){
            int val = Reader.nextInt();
            if (veri[val-1]==false){
                arr[val-1] = 1;
                veri[val-1]= true;
            }
            else {
            arr[val-1] = arr[val-1]+1;
            }
        }

        for (int i=0; i<n; i++){
            int val=0;
            if (veri[i]==false){
                val=0;
            }
            else {
                val= arr[i];
            }

            System.out.println(val);
        }

    }
}

class Node{
    char val;
    Node nxt = null;
    Node prev=null;


}



class solu{
    int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
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

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static String line() throws IOException {
        return reader.readLine();
    }
}