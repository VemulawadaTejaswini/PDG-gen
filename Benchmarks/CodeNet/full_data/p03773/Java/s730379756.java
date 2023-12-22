
import java.io.*;
import java.util.*;

class TestClass {

	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s[] = in.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		out.println((a+b)%24);
		out.close();
	}

}
