import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner();
    static List<List<Integer>> tree;
    static int[] score;
	public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        int[] tree = new int[n];
 
        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            tree[b] = a;
        }
 
        long[] p = new long[n];
        for(int i=0; i<q; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            p[a] += b;
        }
 
        for(int i=1; i<n; i++) {
            p[i] += p[tree[i]];
        }
 
        System.out.print(p[0]);
        for(int i=1; i<n ;i++) {
            System.out.print(' ');
            System.out.print(p[i]);
        }
        System.out.println();
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
