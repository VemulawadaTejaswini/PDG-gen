import java.io.*;
import java.util.*;

public class Main {
  static String[] r = {"Sunny","Cloudy","Rainy"};
  	public static int ncr(String str)
    {
      if(str.equalsIgnoreCase("Sunny"))
        return 0;
      if(str.equalsIgnoreCase("Cloudy"))
        return 1;
      if(str.equalsIgnoreCase("Rainy"))
        return 2;
      return -1;
    }
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, k;

		String str= br.readLine();    
        int c = ncr(str);
	out.print(r[(c+1)%3]);
	out.flush();
	out.close();
	}
}