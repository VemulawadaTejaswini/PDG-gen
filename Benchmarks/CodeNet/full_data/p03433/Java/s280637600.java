
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.Collections;

import java.util.Comparator;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int N = Reader.nextInt();
        int A = Reader.nextInt();
        int tem = (N/500)*500 + A;
        if(tem>=N){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}

class Reader {

    static BufferedReader reader;

    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */

    static void init(InputStream input) {

        reader = new BufferedReader(

                new InputStreamReader(input) );



        tokenizer = new StringTokenizer("");

    }



    static String nextToken() {

        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {

                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
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
        return Integer.parseInt(next());
    }



    static double nextDouble() throws IOException {

        return Double.parseDouble( next() );

    }



    static long nextLong() {

        return Long.parseLong(nextToken());

    }


}
