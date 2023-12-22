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
        boolean bool = false;

        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length()-i+1;j++) {
                String s1 = s.substring(0, j);
                String s2 = s.substring(j+i, s.length());
                String pos = s1 + s2;
                if(pos.equals("keyence")) {
                    bool = true;
                }
            }
        }

        pw.println(bool ? "YES" : "NO");
        pw.close();
	}

}

/*// keyence
	String a=scan.next();
	boolean bool=false;
	for(int i=0;i<a.length();i++) {
		for(int j=0;j<a.length()-i+1;j++) {
			String str1=a.substring(0,j);
			String str2=a.substring(j+i,a.length());
			String str=str1+str2;
			if(str.equals("keyence")) {
				bool=true;
			}
		}
	}
	System.out.println(bool?"YES":"NO");
	}
}*/