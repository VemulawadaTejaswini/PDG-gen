/*
 * @Author: Kaustav Vats  
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;


class Main {

    public static void PrintIntArray(int[] Arr) {
        for (int i=0; i<Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        long A = Reader.nextLong();
        long B = Reader.nextLong();
        if ((A+B) % 2 == 0) {
            System.out.println((A + B)/2);
        }
        else {
            System.out.println("IMPOSSIBLE");
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

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}