import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        boolean is  ;
        char[]s = sc.nextLine().toCharArray();
        int n = s.length;
        is=s[0]=='1'&&s[n-1]=='0';
        for (int i =0;i<(n-1)/2;i++){
            if (s[i]!=s[n-i-2])
                is=false;
        }
        if (is){
            pw.println("1 2");
            int root=2;
            int nxt=3;
            int cursize=1;
            for (int i =1;i<=n/2;i++){
                if (s[i]=='1'){
                    while (i<cursize){
                        pw.println(root+" "+nxt);
                        cursize++;
                        nxt++;
                    }
                        pw.println(root+" "+nxt);
                        root=nxt++;
                        cursize++;
                }
            }
            while (nxt<=n)
                pw.println(root+" "+(nxt++));
        }
        else {
            pw.println(-1);
        }
        pw.flush();
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}