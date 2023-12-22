//code written by a living bruh moment
import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] arr = new long[n];
        ArrayList<Long> p = new ArrayList<Long>();
        ArrayList<Long> ne = new ArrayList<Long>();
        long zc = 0;
        long pc = 0;
        long nc = 0;
        for(int i = 0; i<n; i++){
            arr[i] = in.nextLong();
            if(arr[i]==0)++zc;
            else if(arr[i]>0){
                ++pc;
                p.add(arr[i]);
            }
            else{
                ++nc;
                ne.add(arr[i]);
            }
        }
        long negs = pc*nc;
        long zero = 0;
        long temp = pc+nc;
        while(temp<n){
            zero+=temp;
            ++temp;
        }
        if(k<=negs){
            ArrayList<Long> ans = new ArrayList<Long>();
            for(int i = 0; i<ne.size(); i++){
                for(int j = 0; j<p.size(); j++){
                    ans.add(p.get(j) * ne.get(i));
                }
            }
            Collections.sort(ans);
            out.println(ans.get(k-1));
        }
        else if(k<=negs + zero){
            out.println(0);
        }
        else{
            ArrayList<Long> ans = new ArrayList<Long>();
            for(int i = 0; i<ne.size(); i++){
                for(int j = i+1; j<ne.size(); j++){
                    ans.add(ne.get(j) * ne.get(i));
                }
            }
            for(int i = 0; i<p.size(); i++){
                for(int j = i+1; j<p.size(); j++){
                    ans.add(p.get(j) * p.get(i));
                }
            }
            Collections.sort(ans);
            out.println(ans.get((int) ((k-1)-(negs+zero))));
        }
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
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
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }
        public String nextLine()
        {
            try
            {
                return reader.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=reader.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            tokenizer=new StringTokenizer(next);
            return true;
        }
    }
}