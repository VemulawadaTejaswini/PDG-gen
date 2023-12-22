import java.util.*;
import java.io.*;

public class Main{
    static class Reader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public Reader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }

    public static void main(String[] args) throws IOException{
        Reader in = new Reader(System.in);
        int n = in.nextInt();
        int[] letters = new int[26];
        for(int i=0; i<26; i++){
            letters[i] = 4000;
        }
        for(int i=0; i< n; i++){
            String s = in.next();
            int[] let = new int[26];
            for(int j=0; j<s.length(); j++){
                let[s.charAt(j)-97]++;
            }
            for(int j=0; j<26; j++){
                letters[j] = Math.min(letters[j], let[j]);
            }
        }
        for(int i=0; i<26; i++){
            for(int j=0; j<letters[i]; j++){
                System.out.print((char)(i+97));
            }
        }
    }
}
