import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

import java.io.BufferedReader;



public class Main{

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        HashMap<Integer,Integer> a = new HashMap<>();

        int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int val = 0;
            for (int j = 0; j < s.length(); j++)
                val += s.charAt(j);

            if(a.containsKey(val)){
                ans += a.get(val);
                a.put(val,a.get(val)+1);
            }
            else {
                a.put(val,1);
            }

        }
        out.print(ans);
        out.flush();

    }

}



class Scanner {
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream system) {
        br = new BufferedReader(new InputStreamReader(system));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public char nextChar() throws IOException {
        return next().charAt(0);
    }

    public Long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public boolean ready() throws IOException {
        return br.ready();
    }

    public void waitForInput() throws InterruptedException {
        Thread.sleep(3000);
    }


}

