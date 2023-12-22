
import java.io.*;
import java.util.StringTokenizer;



class Main 
{ 
	static int MaxVol(int l) 
	{ 
		int length = l / 3; 
		l -= length; 
		int breadth = l / 2; 
		int height = l - breadth; 
		return (length * breadth * height); 
	} 
	
	// Driven Program 
	public static void main (String[] args) 
	{ 
		MyScanner sc = new MyScanner();
	      out = new PrintWriter(new BufferedOutputStream(System.out));
	      int l = sc.nextInt();
		System.out.println(MaxVol(l)); 
				
	} 
	public static PrintWriter out;

	   public static class MyScanner {
	      BufferedReader br;
	      StringTokenizer st;
	 
	      public MyScanner() {
	         br = new BufferedReader(new InputStreamReader(System.in));
	      }
	 
	      String next() {
	          while (st == null || !st.hasMoreElements()) {
	              try {
	                  st = new StringTokenizer(br.readLine());
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	          return st.nextToken();
	      }
	 
	      int nextInt() {
	          return Integer.parseInt(next());
	      }
	 
	      long nextLong() {
	          return Long.parseLong(next());
	      }
	 
	      double nextDouble() {
	          return Double.parseDouble(next());
	      }
	 
	      String nextLine(){
	          String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	      }

	   }
} 
