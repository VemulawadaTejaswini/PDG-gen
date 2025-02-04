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
        String n =Reader.next();
        char[] arr = n.toCharArray();
        int ans = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i]=='7'){
                System.out.println("Yes");
                ans = 0;
            }
        }
        if (ans==-1){
            System.out.println("No");
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