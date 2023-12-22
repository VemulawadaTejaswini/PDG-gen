import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
        @@@@@@           @@@@@@
      @@@@@@@@@@       @@@@@@@@@@ 
    @@@@@@@@@@@@@@   @@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@
        @@@@@@@@@@@@@@@@@@@@@@@
          @@@@@@@@@@@@@@@@@@@
            @@@@@@@@@@@@@@@
              @@@@@@@@@@@
                @@@@@@@
                  @@@
                   @ 
*/
public class Main {
	public static void main(String[] args) throws Exception{
		int k = i(); int x = i();
		for (int i=x-k+1; i<x+k; i++) {
			if (i==x+k-1) System.out.println(i);
			else System.out.print(i + " ");
		}
	}
	
	static BufferedReader in;
	static StringTokenizer st = new StringTokenizer("");
	//static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static PrintWriter out;
	static {
		try {
			in = Files.newBufferedReader(Paths.get("TEMPLATE.in"));
			out = new PrintWriter(new BufferedWriter(new FileWriter("TEMPLATE.out")));
		} catch (Exception e) {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		}
	}
	/*static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}*/
	static void check() throws Exception {
		while (!st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
	}
	static String s() throws Exception { check(); return st.nextToken(); }
	static int i() throws Exception { return Integer.parseInt(s()); }
	static long l() throws Exception { return Long.parseLong(s()); }
	static double d() throws Exception { return Double.parseDouble(s()); }
}
