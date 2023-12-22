import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		if(n<1200)
          out.println("ABC");
      	else if(n>=1200 && n<2800)
          	out.println("ARC");
      	else
          	out.println("AGC");
      	out.flush();
    }
}