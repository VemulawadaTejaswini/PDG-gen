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
        int N = Reader.nextInt();
        int[][] Arr = new int[2][N];
        for (int i=0; i<N; i++) {
            Arr[0][i] = Reader.nextInt();
            Arr[1][i] = Arr[0][i];
        }
        int count = 0;
        Arrays.sort(Arr[1]);
        for (int i=0; i<N; i++) {
            if (Arr[0][i] != Arr[1][i]) {
                count++;
            }
        }
        if (count == 0 || count == 2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
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