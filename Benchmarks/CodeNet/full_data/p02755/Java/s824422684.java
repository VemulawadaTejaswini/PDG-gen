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
        double a = Reader.nextInt();
        int b = Reader.nextInt();

        double base = b*10;
        int helper = b*10;
        double ans = 0;
        for (int i=0; i<10; i++){
            double test = Math.floor(base*0.08);
            if (test==a){
                System.out.println(helper);
                break;
            }
            base=base+1;
            helper=helper+1;
            if (i==9){
                System.out.println(-1);
                break;
            }
        }







    }

}

class Node{
    char val;
    Node nxt = null;
    Node prev=null;


}



class solu{

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