// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

public class Main {

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.nextLine();
        pw.println(s.length() == 4 && s.contains("1") && s.contains("9") && s.contains("7") && s.contains("4") ? "YES" : "NO");

        pw.close();
	}

}
