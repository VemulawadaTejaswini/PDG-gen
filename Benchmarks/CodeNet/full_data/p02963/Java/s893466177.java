import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static long dp[]  ,arr[];
    static boolean[] v;
    static LinkedList<Integer>[] adj;
    static int[] ans;

    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        long s = Reader.nextLong();
        System.out.println(0 + " " + 0 + " " + 1 + " " + 0 + " " +0 + " " + s);

    }
}

class TrieNode{

    int[][] next = new int[2][(1000003)*30];
    int[] cnt = new int[(1000003)*30];
    int Idx = 1;
    int value;
    TrieNode[] arr = new TrieNode[2];

    void insert(int n){
        int cur = 0;
        for(int i = 30 - 1; i >= 0; --i) {
            int val = n >> i & 1;
            int nxt = next[val][cur];
            if (nxt == 0)
                nxt = next[val][cur] = Idx++;
            cur = nxt;
            cnt[cur]++;
        }
    }

    int query(int n , int k){
        int num = 0;
        int ans = 0;
        for(int i = 30 - 1; i >= 0; i--) {
            int val = n >> i & 1;
            if (((k >> i) & 1) == 0) {
                if(val==1) {
                    ans += cnt[next[0][num]];
                }
                else{
                    ans += cnt[next[1][num]];
                }
                num = next[val][num];
            }
            else {
                if (val==1) {
                    num = next[0][num];
                }
                else{
                    num = next[1][num];
                }
            }
            if (num == 0) {
                break;
            }
        }
        ans +=cnt[num];
        return ans;
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