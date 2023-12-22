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

        int n = sc.nextInt();
        long[] a = new long[n], b = new long[n];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++) {
            b[i] = sc.nextLong();
        }
        
        ArrayList<Long> plus = new ArrayList<>();
        long sum = 0;
        int num = 0;

        for(int i=0;i<n;i++) {
            long diff = a[i] - b[i];
            if(diff < 0) {
                sum -= diff;
                num++;
            }
            else {
                plus.add(diff);
            }
        }

        if(num == 0) {
            pw.println(0);
            pw.close();
            return;
        }

        int ans = num;
        Collections.sort(plus, Collections.reverseOrder());

        long p = 0;
        for(int i=0;i<n;i++) {
            p += plus.get(i);
            ans++;
            if(p >= sum) {
                break;
            }
        }

        if(p >= sum) {
            pw.println(ans);
        }
        else {
            pw.println(-1);
        }

        pw.close();
	}

}
