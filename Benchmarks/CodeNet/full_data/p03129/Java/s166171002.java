import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		if(n>k)
			out.println("YES");
		else
			out.println("NO");
		out.flush();
	}
}

