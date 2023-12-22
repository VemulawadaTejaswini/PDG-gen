//Atcoder
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

        String str = sc.nextLine();
        boolean one = false, two = false; 

        int first = Integer.parseInt(str.substring(0, 2));
        int second = Integer.parseInt(str.substring(2));

        if(first <= 12 && first > 0) {
            one = true;
        }
        if(second <= 12 && second > 0) {
            two = true;
        }

        if(one && two) pw.println("AMBIGUOUS");
        else if(one) pw.println("MMYY");
        else if(two) pw.println("YYMM");
        else pw.println("NA"); 

        pw.close();
    }
}
