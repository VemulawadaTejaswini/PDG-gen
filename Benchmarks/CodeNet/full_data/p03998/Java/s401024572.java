
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  String a = sc.next();
	  String b = sc.next();
	  String c = sc.next();
	  int posA = 0;
	  int posB = -1;
	  int posC = -1;
	  char turn = 'a';
	  while (posA < a.length() && posB < b.length() && posC < c.length()) {
		  switch (turn) {
		  	  case 'a':
		  		  posA++;
		  		  if (posA == a.length()) {
		  			  System.out.println("A");
		  			  System.exit(0);
		  		  }
		  		  turn = a.charAt(posA);
		  		  break;
		  	  case 'b':
		  		  posB++;
		  		  if (posB == b.length()) {
		  			  System.out.println("B");
		  			  System.exit(0);
		  		  }
		  		  turn = b.charAt(posB);
		  		  break;
		  	  case 'c':
		  		  posC++;
		  		  if (posC == c.length()) {
		  			  System.out.println("C");
		  			  System.exit(0);
		  		  }
		  		  turn = c.charAt(posC);
		  		  break;
		  }
	  }
  }
  
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
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

    String nextLine() {
      String str = "";
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
