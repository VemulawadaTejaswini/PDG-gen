import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int N = in.nextInt();
            A = new int[N];
            B = new int[N];
            _get = new int[H+1];
            for (int i = 0; i <= H; i++) {
              _get[i]=-1;
            }
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }
            out.println(get(H));
        }
      int[] A,B,_get;
      int get(int heal){
        if(heal<=0)return 0;
        if(_get[heal]!=-1)return _get[heal];
        int res=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
          res=Math.min(res,get(heal-A[i])+B[i]);
        }
        _get[heal]=res;
        return res;
      }
 
    }
 
    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }
 
        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }
 
        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
 
    static class state implements Comparable<state> {
        int dmg;
        int cost;
 
        public int compareTo(state o) {
            if (dmg != o.dmg) {
                return dmg - o.dmg;
            }
            if (cost != o.cost) {
                return cost - o.cost;
            }
            return 0;
        }
 
    }
}