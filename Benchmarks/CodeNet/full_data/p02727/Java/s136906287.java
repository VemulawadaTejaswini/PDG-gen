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

        int x = Reader.nextInt();
        int y = Reader.nextInt();
        int a = Reader.nextInt();
        int b = Reader.nextInt();
        int c =Reader.nextInt();

        Integer[] arr_a = new Integer[a];
        Integer[] arr_b = new Integer[b];
        Integer[] arr_c = new Integer[c];
        for (int i=0; i<a; i++){
            arr_a[i] = Reader.nextInt();
        }

        for (int i=0; i<b; i++){
            arr_b[i] = Reader.nextInt();
        }

        for (int i=0; i<c; i++){
            arr_c[i] = Reader.nextInt();
        }


        Arrays.sort(arr_a);
        Arrays.sort(arr_b);
        Arrays.sort(arr_c);
        int ind_c = c-1;

        int[] helper = new int[x+y];
        int ind_h = 0;
        if (x>=a){
            for (int i=0; i<a; i++){
                helper[i] = arr_a[i];
                ind_h++;
            }

            while(ind_h<x){
                helper[ind_h] = arr_c[ind_c];
                ind_c--;
                ind_h++;
            }
        }

        else {
            for (int i=0; i<x; i++){
                helper[i] = arr_a[(a-x)+i];
                ind_h++;
            }
        }

        if (y>=b){
            for (int i=0; i<b; i++){
                helper[Math.min(x,a)+i] = arr_b[i];
                ind_h++;
            }

            while(ind_h<x+y){
                helper[ind_h] = arr_c[ind_c];
                ind_c--;
                ind_h++;
            }
        }

        else {
            for (int i=0; i<y; i++){
                helper[Math.min(x,a)+i] = (arr_b[(b-y)+i]);
            }
        }

        Arrays.sort(helper);

        ind_h = 0;

        while(true){
            if (ind_c<0 || ind_h>=(x+y)){
                break;
            }
            int high = arr_c[ind_c];
            int less = helper[(ind_h)];

            if (high<=less ){
                break;
            }

            else {
                helper[ind_h] = high;
                ind_h++;
                ind_c--;
            }

        }
        long ans = 0;
        for (int i=0; i<helper.length; i++){
            ans=ans+helper[(i)];
        }
        System.out.println(ans);


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